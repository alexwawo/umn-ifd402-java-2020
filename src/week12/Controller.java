package week12;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.sql.ResultSet;
import java.sql.SQLException;


public class Controller {

    private DB db = new DB();

    @FXML
    private TextField nim_field;

    @FXML
    private TextField nama_field;

    @FXML
    private TextField prodi_field;

    @FXML
    protected void handleAddButtonAct(ActionEvent event){
        db.insert(nim_field.getText() , nama_field.getText(), prodi_field.getText());
    }

    @FXML
    protected void handleDelButtonAct(ActionEvent event){
        db.delete(nim_field.getText());
    }

    @FXML
    protected void handleUpdateButtonAct(ActionEvent event){
        db.update(nim_field.getText(), nama_field.getText(), prodi_field.getText());
    }

    @FXML
    protected void handleShowButtonAct(){
        try {
            ResultSet resultSet = db.select();
            while(resultSet.next()){
                System.out.println(resultSet.getString("id"));
                System.out.println(resultSet.getString("nim"));
                System.out.println(resultSet.getString("nama"));
                System.out.println(resultSet.getString("prodi"));
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
