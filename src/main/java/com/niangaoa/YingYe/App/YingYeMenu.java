package com.niangaoa.YingYe.App;

import com.niangaoa.YingYe.YingYeMain;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class YingYeMenu extends Application {
    @Override
    public void start(Stage menuStage) throws Exception {
        //导入FXML
        FXMLLoader yingYeAnnouncementFXML = new FXMLLoader(YingYeMain.class.getResource("Fxml/YingYeMenu.fxml"));
        //设置显示
        Scene scene = new Scene(yingYeAnnouncementFXML.load());
        menuStage.setResizable(false);
        //设置标题
        menuStage.setTitle("营业模拟器");
        //设置Icon
        menuStage.getIcons().add(new Image(String.valueOf(YingYeMain.class.getResource("Img/icon.png"))));
        menuStage.setScene(scene);
        menuStage.show();
    }
}
