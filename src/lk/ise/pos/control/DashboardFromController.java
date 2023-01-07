package lk.ise.pos.control;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author : W.W.M.H.Chamuditha
 * @since : 1/6/2023
 **/
public class DashboardFromController {


    public AnchorPane dashboardContext;
    public Label txtDateAndTime;

    public void initialize(){
        manageDateAndTime();
    }

    private void manageDateAndTime() {
        Timeline timeAndDate = new Timeline(new KeyFrame(Duration.ZERO,
                e-> txtDateAndTime.setText(LocalDateTime.now()
                        .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))),
                new KeyFrame(Duration.seconds(1)));

        timeAndDate.setCycleCount(Animation.INDEFINITE);
        timeAndDate.play();
    }

    public void logoutOnAction(ActionEvent actionEvent) throws IOException {
        setUi("LoginForm");
    }

    public void openCustomerForm(ActionEvent actionEvent) throws IOException {

        /**

         For remove boilerplate codes we can create a new method....
         Stage stage = (Stage) dashboardContext.getScene().getWindow();
         stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/CustomerForm.fxml.fxml"))));
         stage.centerOnScreen();

         **/

        setUi("CustomerForm");

    }

    public void openItemForm(ActionEvent actionEvent) {
    }

    public void openOrderForm(ActionEvent actionEvent) {
    }

    public void openNewOrderForm(ActionEvent actionEvent) {
    }

    public void openIncomeForm(ActionEvent actionEvent) {
    }

    private void setUi(String location) throws IOException {
        Stage stage = (Stage) dashboardContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
        stage.centerOnScreen();

    }

}
