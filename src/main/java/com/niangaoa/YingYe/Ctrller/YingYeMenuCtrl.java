package com.niangaoa.YingYe.Ctrller;

import com.niangaoa.YingYe.App.YingYeGame;
import com.niangaoa.YingYe.App.YingYeTutorial;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class YingYeMenuCtrl {
    @FXML
    public Button Tutorial = new Button();

    @FXML
    private Button Exit1 = new Button();

    @FXML
    private Button Start1 = new Button();

    @FXML
    private void onExit() {
        Platform.exit();
    }

    @FXML
    private void onStart() throws Exception {
        Stage stage = (Stage) Start1.getScene().getWindow();
        stage.close();
        new YingYeGame().start(new Stage());
    }

    @FXML
    private void onTutorial() throws IOException {
        Stage stage = (Stage) Start1.getScene().getWindow();
        stage.close();
        new YingYeTutorial().start(new Stage());
    }
}
