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
    private TextField id_field;

    @FXML
    private TextField name_field;

    @FXML
    private TextField auth_field;

    @FXML
    protected void handleAddButtonAct(ActionEvent event){
        System.out.println("hello");
        System.out.println(id_field.getText());
        db.addDB(Integer.parseInt(id_field.getText()), name_field.getText(), auth_field.getText());
    }

    @FXML
    protected void handleDelButtonAct(ActionEvent event){
        db.delDB(Integer.parseInt(id_field.getText()));
    }

    @FXML
    protected void handleUpdateButtonAct(ActionEvent event){

    }

    @FXML
    protected void handleShowButtonAct(){
        int i = 0;
        try {
            GridPane gridPane = new GridPane();
            ResultSet resultSet = db.showDB();
            int n = resultSet.getRow();
            gridPane.setGridLinesVisible(true);
            gridPane.setAlignment(Pos.CENTER);
            gridPane.setScaleX(2);
            gridPane.setScaleY(2);
            while(resultSet.next()){
                System.out.println(i);
                gridPane.add(new Label(resultSet.getString("id")), 0, i);
                gridPane.add(new Label(resultSet.getString("judul")), 1, i);
                gridPane.add(new Label(resultSet.getString("penulis")), 2, i);
                i++;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
