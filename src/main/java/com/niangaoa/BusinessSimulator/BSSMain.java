package com.niangaoa.BusinessSimulator;

import com.niangaoa.BusinessSimulator.App.BSSAnnouncement;
import javafx.application.Application;
import javafx.stage.Stage;

public class BSSMain extends Application {
    @Override
    public void start(Stage mainStage) throws Exception {
        mainStage.hide();
        new BSSAnnouncement().start(new Stage());
    }
}
