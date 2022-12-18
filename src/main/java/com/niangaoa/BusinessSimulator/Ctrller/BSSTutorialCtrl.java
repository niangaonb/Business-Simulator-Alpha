package com.niangaoa.BusinessSimulator.Ctrller;

import com.niangaoa.BusinessSimulator.App.BSSMenu;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BSSTutorialCtrl {
    @FXML
    private Button back;

    @FXML
    private void onBack() throws Exception {
        Stage stage = (Stage) back.getScene().getWindow();
        stage.close();
        new BSSMenu().start(new Stage());
    }
}
