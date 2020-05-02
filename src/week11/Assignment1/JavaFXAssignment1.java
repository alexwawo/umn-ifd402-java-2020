package week11.Assignment1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavaFXAssignment1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("My Awesome Application");

        Label lblMenu = new Label("MENU");
        MenuBar menuBar = new MenuBar();
        Menu menuFile = new Menu("File");
        MenuItem mFileItem1 = new MenuItem("New");
        MenuItem mFileItem2 = new MenuItem("Open");

        menuFile.getItems().addAll(mFileItem1, mFileItem2);
        menuBar.getMenus().addAll(menuFile);

        Label lblFooter = new Label("FOOTER");

        Label lblContentLeft = new Label("Content LEFT");
        Label lblContentRight = new Label("Content RIGHT");
        HBox contentLayout = new HBox();
        contentLayout.getChildren().addAll(lblContentLeft, lblContentRight);

        BorderPane layout = new BorderPane();
        layout.setTop(menuBar); // layout.setTop(lblMenu);
        layout.setBottom(lblFooter);
        layout.setCenter(contentLayout);

        Scene scene = new Scene(layout, 600, 400);
        stage.setScene(scene);
        stage.show();
    }
}
