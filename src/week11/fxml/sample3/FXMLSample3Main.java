package week11.fxml.sample3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXMLSample3Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample3.fxml"));
        stage.setTitle("Hello World");
        stage.setScene(new Scene(root, 300, 275));
        stage.show();
    }
}
