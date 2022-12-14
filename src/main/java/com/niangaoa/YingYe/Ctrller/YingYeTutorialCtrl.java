package com.niangaoa.YingYe.Ctrller;

import com.niangaoa.YingYe.App.YingYeMenu;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class YingYeTutorialCtrl {
    @FXML
    private Button back;

    @FXML
    private void onBack() throws Exception {
        Stage stage = (Stage) back.getScene().getWindow();
        stage.close();
        new YingYeMenu().start(new Stage());
    }
}
