package com.niangaoa.YingYe.App;

import com.niangaoa.YingYe.YingYeMain;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;


public class YingYeGame extends Application {
    @Override
    public void start(Stage gameStage) throws Exception {
        //导入FXML
        FXMLLoader yingYeMainFXML = new FXMLLoader(YingYeMain.class.getResource("Fxml/YingYeGame.fxml"));
        //设置显示
        Scene scene = new Scene(yingYeMainFXML.load());
        //设置标题
        gameStage.setTitle("营业模拟器");
        gameStage.setResizable(Boolean.FALSE);
        //设置Icon
        gameStage.getIcons().add(new Image(String.valueOf(YingYeMain.class.getResource("Img/icon.png"))));
        gameStage.setScene(scene);
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        gameStage.show();
    }
}
