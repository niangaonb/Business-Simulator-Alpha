package com.niangaoa.YingYe.App;

import com.niangaoa.YingYe.YingYeMain;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class YingYeAnnouncement extends Application {
    @Override
    public void start(Stage announcementStage) throws Exception {
        //导入FXML
        FXMLLoader yingYeAnnouncementFXML = new FXMLLoader(YingYeMain.class.getResource("Fxml/YingYeAnnouncement.fxml"));
        //设置显示
        Scene scene = new Scene(yingYeAnnouncementFXML.load());
        announcementStage.setResizable(false);
        //设置标题
        announcementStage.setTitle("营业模拟器");
        //设置Icon
        announcementStage.getIcons().add(new Image(String.valueOf(YingYeMain.class.getResource("Img/icon.png"))));
        announcementStage.setScene(scene);
        announcementStage.show();
    }
}
