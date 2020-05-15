package week14.controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import week14.DBConnection;
import week14.model.Mahasiswa;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class IndexController implements Initializable {
    @FXML private TableView<Mahasiswa> tableMahasiswa;
    @FXML private TableColumn<Mahasiswa, String> columnNim;
    @FXML private TableColumn<Mahasiswa, String> columnNama;
    @FXML private TableColumn<Mahasiswa, String> columnProdi;
    @FXML private RadioButton radioNew;
    @FXML private RadioButton radioEdit;
    @FXML private RadioButton radioDelete;
    @FXML private TextField textFieldNim;
    @FXML private TextField textFieldNama;
    @FXML private TextField textFieldProdi;
    @FXML private Button btnAction;

    final ToggleGroup group = new ToggleGroup();
    String mode;
    Mahasiswa selectedMhs = null;


    // Initialize observable list to hold database data
    private ObservableList<Mahasiswa> data;
    private DBConnection dbConnection;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        radioNew.setToggleGroup(group);
        radioEdit.setToggleGroup(group);
        radioDelete.setToggleGroup(group);
        radioNew.setSelected(true);

        dbConnection = new DBConnection();

        // Step 1. Connect to DB
        Connection conn = dbConnection.connect();
        data = FXCollections.observableArrayList();
        // Execute query and store result in a resultset
        try {
            // Step 2. What do you want to do
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM mahasiswa");
            // Step 3. Display Query Result
            while(rs.next()){
                // get string from db, whichever way
                data.add(new Mahasiswa(rs.getInt("id"), rs.getString("nim"), rs.getString("nama"), rs.getString("prodi")));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        // Set cell value factory to tableview
        // PropertyValue Factory must be the same with the one set in model class
//        columnId.setCellValueFactory(new PropertyValueFactory<>("id"));
        columnNim.setCellValueFactory(new PropertyValueFactory<>("nim"));
        columnNama.setCellValueFactory(new PropertyValueFactory<>("nama"));
        columnProdi.setCellValueFactory(new PropertyValueFactory<>("prodi"));

        tableMahasiswa.setItems(null);
        tableMahasiswa.setItems(data);

        group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observableValue, Toggle toggle, Toggle t1) {
                RadioButton rb = (RadioButton) group.getSelectedToggle();
                if(rb != null) {
                    mode = rb.getText();
                    System.out.println(mode);
                    if(mode.equals("New")){
                        btnAction.setText("Save");
                        textFieldNim.setText("");
                        textFieldNama.setText("");
                        textFieldProdi.setText("");
                    }else if(mode.equals("Edit")){
                        btnAction.setText("Update");

                    }else if(mode.equals("Delete")){
                        btnAction.setText("Delete");
                    }
                }
            }
        });

        // Handle row click on tableMahasiswa
        tableMahasiswa.setOnMouseClicked((MouseEvent event) -> {
            if(event.getButton().equals(MouseButton.PRIMARY)){
                int index = tableMahasiswa.getSelectionModel().getSelectedIndex();
                selectedMhs = tableMahasiswa.getItems().get(index);
                System.out.println(selectedMhs.getNama());

                if(mode.equals("New")){
                    textFieldNim.setText("");
                    textFieldNama.setText("");
                    textFieldProdi.setText("");
                }else{
                    textFieldNim.setText(selectedMhs.getNim());
                    textFieldNama.setText(selectedMhs.getNama());
                    textFieldProdi.setText(selectedMhs.getProdi());
                }

            }
        });
    }

    @FXML
    public void handleBtnAction(ActionEvent actionEvent) {
        String nim = textFieldNim.getText();
        String nama = textFieldNama.getText();
        String prodi = textFieldProdi.getText();
        String sql = "";
        System.out.println(mode);

        // Step 1. Connect to DB
        Connection conn = dbConnection.connect();

        if(mode.equals("New")){
            // INSERT PROCESS
            sql = "INSERT INTO mahasiswa(nim, nama, prodi) VALUES ('" + nim + "', '" + nama + "', '" + prodi + "')";
        }else if(mode.equals("Edit")){
            // Update Process
            sql = "UPDATE mahasiswa " +
                    "SET nim = '" + nim + "', nama = '" + nama + "', prodi = '" + prodi + "'" +
                    "WHERE id = '" + selectedMhs.getId() + "'";
        }else if(mode.equals("Delete")){
            // Delete Process
            sql = "DELETE FROM mahasiswa WHERE id = " + selectedMhs.getId();
        }

        try{
            conn.createStatement().executeUpdate(sql);
        }catch (Exception e){
            e.printStackTrace();
        }

        // Refresh Table
        data = null;
        data = FXCollections.observableArrayList();
        // Execute query and store result in a resultset
        try {
            // Step 2. What do you want to do
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM mahasiswa");
            // Step 3. Display Query Result
            while(rs.next()){
                // get string from db, whichever way
                data.add(new Mahasiswa(rs.getInt("id"), rs.getString("nim"), rs.getString("nama"), rs.getString("prodi")));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        tableMahasiswa.setItems(null);
        tableMahasiswa.setItems(data);

    }
}
