package com.niangaoa.BusinessSimulator.App;

import com.niangaoa.BusinessSimulator.BSSMain;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class BSSAnnouncement extends Application {
    @Override
    public void start(Stage announcementStage) throws Exception {
        //导入FXML
        FXMLLoader yingYeAnnouncementFXML = new FXMLLoader(BSSMain.class.getResource("Fxml/BSSAnnouncement.fxml"));
        //设置显示
        Scene scene = new Scene(yingYeAnnouncementFXML.load());
        announcementStage.setResizable(false);
        //设置标题
        announcementStage.setTitle("营业模拟器");
        //设置Icon
        announcementStage.getIcons().add(new Image(String.valueOf(BSSMain.class.getResource("Img/icon.png"))));
        announcementStage.setScene(scene);
        announcementStage.show();
    }
}
