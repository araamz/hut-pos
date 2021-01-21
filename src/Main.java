import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import Model.terminal;
import View.View;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        new View();

    }

    public static void main(String[] args) {

        terminal cash_one = new terminal("register_one");


        launch(args);

    }
}
