package lk.ise.pos.control;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author : W.W.M.H.Chamuditha
 * @since : 1/6/2023
 **/
public class DashboardFromController {


    public AnchorPane dashboardContext;

    public void logoutOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) dashboardContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/LoginForm.fxml"))));
        stage.centerOnScreen();
        new Alert(Alert.AlertType.WARNING,"Logged out!").show();
    }
}