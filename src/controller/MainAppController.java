// MainAppController.java
package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainAppController {

    @FXML
    private Button registrationButton;

    @FXML
    public void goToRegistration(ActionEvent event) throws IOException {
        Parent registrationParent = FXMLLoader.load(getClass().getResource("/view/Registration.fxml"));
        Scene registrationScene = new Scene(registrationParent);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(registrationScene);
        window.show();
    }
}
