package lk.ise.pos.control;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;
import lk.ise.pos.db.Database;
import lk.ise.pos.entity.User;
import org.mindrot.jbcrypt.BCrypt;

import java.io.IOException;
import java.util.Stack;

/**
 * @author : W.W.M.H.Chamuditha
 * @since : 12/31/2022
 **/
public class LoginFormController {

    public TextField txtUserName;
    public PasswordField pwd;
    public AnchorPane logingFormContext;

    public void initialize(){

    }

    public void loggingOnAction(ActionEvent actionEvent) throws IOException {

        /** for (User u : Database.users){
            if (u.getUsername().equals(txtUserName.getText())){
                //here is the user
            }
        } //not found  **/

        User selectedUser = Database.users.stream().filter(user -> user.getUsername()
                .equals(txtUserName.getText())).findFirst().orElse(null);

        if (selectedUser != null){

            if (BCrypt.checkpw(pwd.getText(),selectedUser.getPassword())){

                Stage stage = (Stage) logingFormContext.getScene().getWindow();
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DashboardFrom.fxml"))));
                stage.centerOnScreen();

            }else {
                System.out.println("Wrong password");
            }

        }else {
            new Alert(Alert.AlertType.WARNING,"User Not found!").show();
        }
    }

    public void loginOnAction(ActionEvent actionEvent) throws IOException {

        loggingOnAction(actionEvent);
    }
}
