package com.niangaoa.BusinessSimulator.Ctrller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

import java.net.URL;
import java.util.ResourceBundle;

public class BSSMessageCtrl implements Initializable {
    @FXML
    public Text message1 = new Text();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        message1.setTextAlignment(TextAlignment.CENTER);
        message1.setText("Test");
    }
}
