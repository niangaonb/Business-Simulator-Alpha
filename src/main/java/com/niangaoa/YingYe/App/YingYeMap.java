package com.niangaoa.YingYe.App;
import com.niangaoa.YingYe.YingYeMain;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class YingYeMap extends Application {
    @Override
    public void start(Stage mapStage) throws IOException {
        //导入FXML
        FXMLLoader yingYeAnnouncementFXML = new FXMLLoader(YingYeMain.class.getResource("Fxml/YingYeMap.fxml"));
        //设置显示
        Scene scene = new Scene(yingYeAnnouncementFXML.load());
        mapStage.setResizable(false);
        //设置标题
        mapStage.setTitle("营业模拟器");
        //设置Icon
        mapStage.getIcons().add(new Image(String.valueOf(YingYeMain.class.getResource("Img/icon.png"))));
        mapStage.setScene(scene);
        mapStage.show();
    }
}
