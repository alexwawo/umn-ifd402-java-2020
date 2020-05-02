package week11.layouts;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ComboLayout extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Label lbl1 = new Label("HR Management System");

        RadioButton rb1 = new RadioButton("Permanent Staff");
        RadioButton rb2 = new RadioButton("Contract Staff");
        RadioButton rb3 = new RadioButton("Intern Staff");
        Button btnShow = new Button("Show Data");
        HBox hBox1 = new HBox();
        hBox1.getChildren().addAll(rb1, rb2, rb3, btnShow);

        Label lblId = new Label("ID");
        TextField txtId = new TextField();
        HBox hBox2 = new HBox();
        hBox2.getChildren().addAll(lblId, txtId);

        Label lblName = new Label("Name");
        TextField txtName = new TextField();
        HBox hBox3 = new HBox();
        hBox3.getChildren().addAll(lblName, txtName);

        Label lblDept = new Label("Department");
        TextField txtDept = new TextField();
        HBox hBox4 = new HBox();
        hBox4.getChildren().addAll(lblDept, txtDept);

        Label lblSalary = new Label("Salary");
        TextField txtSalary = new TextField();
        HBox hBox5 = new HBox();
        hBox5.getChildren().addAll(lblSalary, txtSalary);

        Label lblKpi = new Label("KPI Score");
        TextField txtKpi = new TextField();
        HBox hBox6 = new HBox();
        hBox6.getChildren().addAll(lblKpi, txtKpi);

        Button btn1 = new Button("Save");
        Button btn2 = new Button("Reset");
        Button btn3 = new Button("Show Data");
        HBox hBox7 = new HBox();
        hBox7.getChildren().addAll(btn1, btn2, btn3);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(lbl1, hBox1, hBox2, hBox3, hBox4, hBox5, hBox6, hBox7);

        Scene scene = new Scene(vBox);
        stage.setTitle("UAS");
        stage.setScene(scene);

        stage.show();


    }
}
