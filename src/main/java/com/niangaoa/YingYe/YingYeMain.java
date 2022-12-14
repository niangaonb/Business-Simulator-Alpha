package com.niangaoa.YingYe;

import com.niangaoa.YingYe.App.YingYeAnnouncement;
import javafx.application.Application;
import javafx.stage.Stage;

public class YingYeMain extends Application {
    @Override
    public void start(Stage mainStage) throws Exception {
        mainStage.hide();
        new YingYeAnnouncement().start(new Stage());
    }
}
