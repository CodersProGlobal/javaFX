package com.example.javafxdemo;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class Hello2Controller {
    @FXML
    private TextField txtField1;
    @FXML
    protected void onHelloButtonClick() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        //alert.setTitle("Message Here...");
        alert.setContentText("Hello " + txtField1.getText());
        alert.show();
    }
}
