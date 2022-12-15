package com.niangaoa.YingYe.Ctrller;


import com.niangaoa.YingYe.App.YingYeMap;
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
import java.util.LinkedList;
import java.util.List;
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
    //分-------------------------------------割-------------------------------------线
    @FXML
    private Text money;

    //分-------------------------------------割-------------------------------------线
    @FXML
    private Button Sleep;

    //分-------------------------------------割-------------------------------------线
    @FXML
    private Text day;

    //分-------------------------------------割-------------------------------------线
    @FXML
    private Button map;

    //分-------------------------------------割-------------------------------------线
    private int daySet = 1;

    @FXML
    private Pane pane = new Pane();

    //分-------------------------------------割-------------------------------------线
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

    //分-------------------------------------割-------------------------------------线
    @FXML
    private void onBuy1() {
        this.onBuy(buyData.get(0), 1, have1);
    }

    @FXML
    private void onBuy2() {
        this.onBuy(buyData.get(1), 1, have2);
    }
    @FXML
    private void onBuy3() {
        this.onBuy(buyData.get(2), 1, have3);
    }
    @FXML
    private void onBuy4() {
        this.onBuy(buyData.get(3), 1, have4);
    }
    @FXML
    private void onBuy5() {
        this.onBuy(buyData.get(4), 10, have5);
    }
    @FXML
    private void onBuy6() {
        this.onBuy(buyData.get(5), 10, have6);
    }
    @FXML
    private void onBuy7() {
        this.onBuy(buyData.get(6), 2, have7);
    }
    @FXML
    private void onBuy8() {
        this.onBuy(buyData.get(7), 1, have8);
    }
    @FXML
    private void onBuy9() {
        this.onBuy(buyData.get(8), 1, have9);
    }
    @FXML
    private void onBuy10() {
        this.onBuy(buyData.get(9), 1, have10);
    }
    @FXML
    private void onBuy11() {
        this.onBuy(buyData.get(10), 1, have11);
    }
    @FXML
    private void onBuy12() {
        onBuy(buyData.get(11), 1,have12);
    }

    @FXML
    private void onSell1() {
        onSell(buyData.get(0), have1);
    }

    @FXML
    private void onSell2() {
        onSell(buyData.get(1), have2);
    }

    @FXML
    private void onSell3() {
        onSell(buyData.get(2), have3);
    }

    @FXML
    private void onSell4() {
        onSell(buyData.get(3), have4);
    }

    @FXML
    private void onSell5() {
        onSell(buyData.get(4), have5);
    }

    @FXML
    private void onSell6() {
        onSell(buyData.get(5), have6);
    }

    @FXML
    private void onSell7() {
        onSell(buyData.get(6), have7);
    }

    @FXML
    private void onSell8() {
        onSell(buyData.get(7), have8);
    }

    @FXML
    private void onSell9() {
        onSell(buyData.get(8), have10);
    }

    @FXML
    private void onSell10() {
        onSell(buyData.get(9), have10);
    }

    @FXML
    private void onSell11() {
        onSell(buyData.get(10), have11);
    }

    @FXML
    private void onSell12() {
        onSell(buyData.get(11), have12);
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
    //分-------------------------------------割-------------------------------------线
    private void onBuy(int buySet, int storageNeed, Text have) {
        int moneyGet = Integer.parseInt(money.getText());
        int storageGet = Integer.parseInt(storage.getText());
        if (moneyGet - buySet >= 0 && storageGet > 0) {
            money.setText(String.valueOf(moneyGet - buySet));
            storage.setText(String.valueOf(storageGet - storageNeed));
        }
        if (storageGet > 0 && moneyGet - buySet >= 0) {
            int haveSet = Integer.parseInt(have.getText());
            have.setText(String.valueOf(++haveSet));
        }
    }

    private void onSell(int sellMoney, Text have) {
        int moneyGet = Integer.parseInt(money.getText());
        int storageGet = Integer.parseInt(storage.getText());
        int haveGet = Integer.parseInt(have.getText());
        if (Integer.parseInt(have.getText()) > 0) {
            money.setText(String.valueOf(moneyGet + sellMoney));
            storage.setText(String.valueOf(storageGet + 1));
            have.setText(String.valueOf(haveGet - 1));
        }
    }
    //分-------------------------------------割-------------------------------------线

    public List<Integer> buyData = new LinkedList<>();

    public YingYeGameCtrl() {

        buyData.add(3000);
        buyData.add(3500);
        buyData.add(100000);
        buyData.add(5000000);
        buyData.add(200000);
        buyData.add(50000);
        buyData.add(100000);
        buyData.add(25000);
        buyData.add(10000);
        buyData.add(1);
        buyData.add(30000);
        buyData.add(8000000);
    }
    //分-------------------------------------割-------------------------------------线

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        pane.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        {
            List<Button> arrayList = new LinkedList<>();
            arrayList.add(buy1);
            arrayList.add(buy2);
            arrayList.add(buy3);
            arrayList.add(buy4);
            arrayList.add(buy5);
            arrayList.add(buy6);
            arrayList.add(buy7);
            arrayList.add(buy8);
            arrayList.add(buy9);
            arrayList.add(buy10);
            arrayList.add(buy11);
            arrayList.add(buy12);
            for (Button list1 :
                    arrayList) {
                list1.getStyleClass().add("btn");
            }
        }

        day.setText(String.valueOf(daySet));
        int moneySet = 50000000;
        money.setText(String.valueOf(moneySet));
        storage.setText(String.valueOf(3000));
    }
}
