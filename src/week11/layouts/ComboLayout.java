package week11.layouts;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        HBox hBox1 = new HBox();
        hBox1.getChildren().addAll(btn1, btn2);

        Button btnA = new Button("Button A");
        Button btnB = new Button("Button B");
        HBox hBox2 = new HBox();
        hBox2.getChildren().addAll(btnA, btnB);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(hBox1, hBox2);

        Scene scene = new Scene(vBox);
        stage.setTitle("Combo Layout");
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
}
