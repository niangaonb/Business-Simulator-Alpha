package com.niangaoa.BusinessSimulator.App;

import com.niangaoa.BusinessSimulator.BSSMain;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class BSSMenu extends Application {
    @Override
    public void start(Stage menuStage) throws Exception {
        //导入FXML
        FXMLLoader yingYeAnnouncementFXML = new FXMLLoader(BSSMain.class.getResource("Fxml/BSSMenu.fxml"));
        //设置显示
        Scene scene = new Scene(yingYeAnnouncementFXML.load());
        menuStage.setResizable(false);
        //设置标题
        menuStage.setTitle("营业模拟器");
        //设置Icon
        menuStage.getIcons().add(new Image(String.valueOf(BSSMain.class.getResource("Img/icon.png"))));
        menuStage.setScene(scene);
        menuStage.show();
    }
}
