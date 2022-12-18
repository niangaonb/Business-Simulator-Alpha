package com.niangaoa.BusinessSimulator.App;

import com.niangaoa.BusinessSimulator.BSSMain;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class BSSTutorial extends Application {
    @Override
    public void start(Stage tutorialStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BSSMain.class.getResource("Fxml/BSSTutorial.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        tutorialStage.setResizable(false);
        tutorialStage.setScene(scene);
        tutorialStage.setTitle("营业模拟器");
        tutorialStage.getIcons().add(new Image(String.valueOf(BSSMain.class.getResource("Img/icon.png"))));
        tutorialStage.show();
        tutorialStage.setOnCloseRequest(event -> {
            try {
                new BSSMenu().start(new Stage());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }
}
