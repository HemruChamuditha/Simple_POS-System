package lk.ise.pos;/**
 * @author : W.W.M.H.Chamuditha
 * @since : 1/4/2023
 **/

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/CustomerForm.fxml"))));
        primaryStage.centerOnScreen();
        primaryStage.show();
    }
}
