package week11.layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

// https://www.tutorialspoint.com/javafx/layout_borderpane.htm

public class BorderPaneLayout extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //Instantiating the BorderPane class
        BorderPane bPane = new BorderPane();

        //Setting the top, bottom, center, right and left nodes to the pane
        bPane.setTop(new TextField("Top"));
        bPane.setBottom(new TextField("Bottom"));
        bPane.setLeft(new TextField("Left"));
        bPane.setRight(new TextField("Right"));
        bPane.setCenter(new TextField("Center"));

        //Creating a scene object
        Scene scene = new Scene(bPane);

        //Setting title to the Stage
        stage.setTitle("BorderPane Example");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
}
