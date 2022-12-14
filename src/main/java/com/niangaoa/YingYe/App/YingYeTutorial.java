package com.niangaoa.YingYe.App;

import com.niangaoa.YingYe.YingYeMain;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class YingYeTutorial extends Application {
    @Override
    public void start(Stage tutorialStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(YingYeMain.class.getResource("Fxml/YingYeTutorial.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        tutorialStage.setResizable(false);
        tutorialStage.setScene(scene);
        tutorialStage.setTitle("营业模拟器");
        tutorialStage.getIcons().add(new Image(String.valueOf(YingYeMain.class.getResource("Img/icon.png"))));
        tutorialStage.show();
        tutorialStage.setOnCloseRequest(event -> {
            try {
                new YingYeMenu().start(new Stage());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }
}
