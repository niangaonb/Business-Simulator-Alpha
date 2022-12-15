package com.niangaoa.YingYe.Ctrller;


import com.niangaoa.YingYe.App.YingYeMap;
import com.niangaoa.YingYe.GameContro.BuySell;
import com.niangaoa.YingYe.GameContro.GameData;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ResourceBundle;

public class YingYeGameCtrl implements Initializable {
    @FXML
    public Text storage = new Text();
    @FXML
    private Button write;
    @FXML
    private Button read;
    @FXML
    private Text have1;
    @FXML
    private Text have2;
    @FXML
    private Text have3;
    @FXML
    private Text have4;
    @FXML
    private Text have5;
    @FXML
    private Text have6;
    @FXML
    private Text have7;
    @FXML
    private Text have8;
    @FXML
    private Text have9;
    @FXML
    private Text have10;
    @FXML
    private Text have11;
    @FXML
    private Text have12;
    @FXML
    private Text Health;

    //分-------------------------------------割-------------------------------------线
    @FXML
    private Button buy1 = new Button();
    @FXML
    private Button buy2 = new Button();
    @FXML
    private Button buy3 = new Button();
    @FXML
    private Button buy4 = new Button();
    @FXML
    private Button buy5 = new Button();
    @FXML
    private Button buy6 = new Button();
    @FXML
    private Button buy7 = new Button();
    @FXML
    private Button buy8 = new Button();
    @FXML
    private Button buy9 = new Button();
    @FXML
    private Button buy10 = new Button();
    @FXML
    private Button buy11 = new Button();
    @FXML
    private Button buy12 = new Button();

    @FXML
    private Button sell1;

    @FXML
    private Button sell2;

    @FXML
    private Button sell3;

    @FXML
    private Button sell4;

    @FXML
    private Button sell5;

    @FXML
    private Button sell6;

    @FXML
    private Button sell7;

    @FXML
    private Button sell8;

    @FXML
    private Button sell9;

    @FXML
    private Button sell10;

    @FXML
    private Button sell11;

    @FXML
    private Button sell12;

    @FXML
    private Text money = new Text();


    @FXML
    private Button Sleep;


    @FXML
    private Text day;


    @FXML
    private Button map;


    private int daySet = 1;

    @FXML
    private Pane pane = new Pane();


    BuySell buySell = new BuySell();


    public YingYeGameCtrl() {
    }


    @FXML
    private void onMapChick() throws IOException {
        new YingYeMap().start(new Stage());
    }

    @FXML
    private void onSleep() {
        day.setText(String.valueOf(++daySet));
        int healthSet = 100;
        Health.setText(String.valueOf(healthSet));
    }


    @FXML
    private void onBuy1() {
        buySell.onBuy(GameData.buyData.get(0), 1, have1);
    }

    @FXML
    private void onBuy2() {
        buySell.onBuy(GameData.buyData.get(1), 1, have2);
    }
    @FXML
    private void onBuy3() {
        buySell.onBuy(GameData.buyData.get(2), 1, have3);
    }
    @FXML
    private void onBuy4() {
        buySell.onBuy(GameData.buyData.get(3), 1, have4);
    }
    @FXML
    private void onBuy5() {
        buySell.onBuy(GameData.buyData.get(4), 10, have5);
    }
    @FXML
    private void onBuy6() {
        buySell.onBuy(GameData.buyData.get(5), 10, have6);
    }
    @FXML
    private void onBuy7() {
        buySell.onBuy(GameData.buyData.get(6), 2, have7);
    }
    @FXML
    private void onBuy8() {
        buySell.onBuy(GameData.buyData.get(7), 1, have8);
    }
    @FXML
    private void onBuy9() {
        buySell.onBuy(GameData.buyData.get(8), 1, have9);
    }
    @FXML
    private void onBuy10() {
        buySell.onBuy(GameData.buyData.get(9), 1, have10);
    }
    @FXML
    private void onBuy11() {
        buySell.onBuy(GameData.buyData.get(10), 1, have11);
    }
    @FXML
    private void onBuy12() {
        buySell.onBuy(GameData.buyData.get(11), 1,have12);
    }

    @FXML
    private void onSell1() {
        buySell.onSell(GameData.buyData.get(0), 1, have1);
    }

    @FXML
    private void onSell2() {
        buySell.onSell(GameData.buyData.get(1), 1, have2);
    }

    @FXML
    private void onSell3() {
        buySell.onSell(GameData.buyData.get(2), 1, have3);
    }

    @FXML
    private void onSell4() {
        buySell.onSell(GameData.buyData.get(3), 1, have4);
    }

    @FXML
    private void onSell5() {
        buySell.onSell(GameData.buyData.get(4), 10, have5);
    }

    @FXML
    private void onSell6() {
        buySell.onSell(GameData.buyData.get(5), 1, have6);
    }

    @FXML
    private void onSell7() {
        buySell.onSell(GameData.buyData.get(6), 2, have7);
    }

    @FXML
    private void onSell8() {
        buySell.onSell(GameData.buyData.get(7), 1, have8);
    }

    @FXML
    private void onSell9() {
        buySell.onSell(GameData.buyData.get(8), 1, have9);
    }

    @FXML
    private void onSell10() {
        buySell.onSell(GameData.buyData.get(9), 1, have10);
    }

    @FXML
    private void onSell11() {
        buySell.onSell(GameData.buyData.get(10), 1, have11);
    }

    @FXML
    private void onSell12() {
        buySell.onSell(GameData.buyData.get(11), 5, have12);
    }
    //分-------------------------------------割-------------------------------------线
    @FXML
    private void onRead() throws IOException {
        File f = new File("saves.ini");
        FileInputStream fileInputStream = new FileInputStream(f);
        InputStreamReader reader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
        reader.close();
        fileInputStream.close();
    }

    @FXML
    private void onWrite() throws IOException {
        File f = new File("saves.ini");
        FileOutputStream fileOutputStream = new FileOutputStream(f);
        OutputStreamWriter writer = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
        writer.append(money.getText());

        writer.append(Health.getText());

        writer.close();

        fileOutputStream.close();
        System.out.println("write successfully");
    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        pane.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        {
            GameData.arrayList.add(buy1);
            GameData.arrayList.add(buy2);
            GameData.arrayList.add(buy3);
            GameData.arrayList.add(buy4);
            GameData.arrayList.add(buy5);
            GameData.arrayList.add(buy6);
            GameData.arrayList.add(buy7);
            GameData.arrayList.add(buy8);
            GameData.arrayList.add(buy9);
            GameData.arrayList.add(buy10);
            GameData.arrayList.add(buy11);
            GameData.arrayList.add(buy12);

            GameData.addCssByArray(GameData.arrayList, "btn");
        }

        day.setText(String.valueOf(daySet));
        int moneySet = 50000000;
        money.setText(String.valueOf(moneySet));
        storage.setText(String.valueOf(3000));
        buySell.setMoney(money);
        buySell.setStorage(storage);
    }
}
