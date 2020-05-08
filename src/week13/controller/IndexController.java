package week13.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import week13.DBConnection;
import week13.model.Mahasiswa;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class IndexController implements Initializable {

    @FXML
    private TableView<Mahasiswa> tableMahasiswa;
    @FXML
    private TableColumn<Mahasiswa, Integer> columnId;
    @FXML
    private TableColumn<Mahasiswa, String> columnNim;
    @FXML
    private TableColumn<Mahasiswa, String> columnNama;
    @FXML
    private TableColumn<Mahasiswa, String> columnProdi;
    @FXML
    private Button btnLoad;
    @FXML
    private Button btnAddMhs;

    // Initialize observable list to hold database data
    private ObservableList<Mahasiswa> data;
    private DBConnection dbConnection;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
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
        columnId.setCellValueFactory(new PropertyValueFactory<>("id"));
        columnNim.setCellValueFactory(new PropertyValueFactory<>("nim"));
        columnNama.setCellValueFactory(new PropertyValueFactory<>("nama"));
        columnProdi.setCellValueFactory(new PropertyValueFactory<>("prodi"));

        tableMahasiswa.setItems(null);
        tableMahasiswa.setItems(data);

        // Handle row click on tableMahasiswa
        tableMahasiswa.setOnMouseClicked((MouseEvent event) -> {
            if(event.getButton().equals(MouseButton.PRIMARY)){
                int index = tableMahasiswa.getSelectionModel().getSelectedIndex();
                Mahasiswa mhs = tableMahasiswa.getItems().get(index);
                System.out.println(mhs.getNama());
            }
        });
    }

    @FXML
    private void handleAddMhs(ActionEvent event) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/week13/fxml/create.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Create New Mahasiswa");
            stage.setScene(new Scene(root));
            stage.show();

            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void loadDataFromDatabase(ActionEvent event) {
//        Connection conn = dbConnection.connect();
//        data = FXCollections.observableArrayList();
//        // Execute query and store result in a resultset
//        try {
//            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM mahasiswa");
//            while(rs.next()){
//                // get string from db, whichever way
//                data.add(new Mahasiswa(rs.getInt("id"), rs.getString("nim"), rs.getString("nama"), rs.getString("prodi")));
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//
//        // Set cell value factory to tableview
//        // PropertyValue Factory must be the same with the one set in model class
//        columnId.setCellValueFactory(new PropertyValueFactory<>("id"));
//        columnNim.setCellValueFactory(new PropertyValueFactory<>("nim"));
//        columnNama.setCellValueFactory(new PropertyValueFactory<>("nama"));
//        columnProdi.setCellValueFactory(new PropertyValueFactory<>("prodi"));
//
//        tableMahasiswa.setItems(null);
//        tableMahasiswa.setItems(data);
    }
}
