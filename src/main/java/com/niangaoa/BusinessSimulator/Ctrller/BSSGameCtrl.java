package com.niangaoa.BusinessSimulator.Ctrller;


import com.niangaoa.BusinessSimulator.App.BSSMap;
import com.niangaoa.BusinessSimulator.GameContro.BuySell;
import com.niangaoa.BusinessSimulator.GameContro.DataSave;
import com.niangaoa.BusinessSimulator.GameContro.GameData;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class BSSGameCtrl implements Initializable {
    @FXML private Label honor;
    @FXML private Label tired;
    @FXML private Label level;
    @FXML private Label xp;
    @FXML private Label hunger;
    @FXML private Label thinking;
    @FXML private GridPane gridPane;
    @FXML private Label storage;
    @FXML private Button write;
    @FXML private Button read;
    @FXML private Label have1;
    @FXML private Label have2;
    @FXML private Label have3;
    @FXML private Label have4;
    @FXML private Label have5;
    @FXML private Label have6;
    @FXML private Label have7;
    @FXML private Label have8;
    @FXML private Label have9;
    @FXML private Label have10;
    @FXML private Label have11;
    @FXML private Label have12;
    @FXML private Label Health;
    @FXML private Button buy1;
    @FXML private Button buy2;
    @FXML private Button buy3;
    @FXML private Button buy4;
    @FXML private Button buy5;
    @FXML private Button buy6;
    @FXML private Button buy7;
    @FXML private Button buy8;
    @FXML private Button buy9;
    @FXML private Button buy10;
    @FXML private Button buy11;
    @FXML private Button buy12;
    @FXML private Button sell1;
    @FXML private Button sell2;
    @FXML private Button sell3;
    @FXML private Button sell4;
    @FXML private Button sell5;
    @FXML private Button sell6;
    @FXML private Button sell7;
    @FXML private Button sell8;
    @FXML private Button sell9;
    @FXML private Button sell10;
    @FXML private Button sell11;
    @FXML private Button sell12;
    @FXML private Label money;
    @FXML private Button Sleep;
    @FXML private Label day;
    @FXML private Button map;
    @FXML private Button update;
    @FXML private Pane pane;

    private int daySet = 1;

    private final List<String> nameDataList = new ArrayList<>();
    private final List<Label> textArrayList = new ArrayList<>();
    private final List<Button> readButton = new ArrayList<>();
    private final List<Button> guiSomeButton = new ArrayList<>();
    private final DataSave dataSave = new DataSave();
    private final BuySell buySell = new BuySell();
    private final GameData gameData = new GameData();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        day.setText(String.valueOf(daySet));
        int moneySet = 50000000;
        money.setText(String.valueOf(moneySet));
        storage.setText(String.valueOf(3000));
        buySell.setMoney(money);
        buySell.setStorage(storage);
        {
            {
                gameData.addButtonToBuyArray(buy1);
                gameData.addButtonToBuyArray(buy2);
                gameData.addButtonToBuyArray(buy3);
                gameData.addButtonToBuyArray(buy4);
                gameData.addButtonToBuyArray(buy5);
                gameData.addButtonToBuyArray(buy6);
                gameData.addButtonToBuyArray(buy7);
                gameData.addButtonToBuyArray(buy8);
                gameData.addButtonToBuyArray(buy9);
                gameData.addButtonToBuyArray(buy10);
                gameData.addButtonToBuyArray(buy11);
                gameData.addButtonToBuyArray(buy12);
                gameData.addCssByArray(gameData.buyList, "btn", "btn-default");
            }
            {
                gameData.addButtonToSellArray(sell1);
                gameData.addButtonToSellArray(sell2);
                gameData.addButtonToSellArray(sell3);
                gameData.addButtonToSellArray(sell4);
                gameData.addButtonToSellArray(sell5);
                gameData.addButtonToSellArray(sell6);
                gameData.addButtonToSellArray(sell7);
                gameData.addButtonToSellArray(sell8);
                gameData.addButtonToSellArray(sell9);
                gameData.addButtonToSellArray(sell10);
                gameData.addButtonToSellArray(sell11);
                gameData.addButtonToSellArray(sell12);
                gameData.addCssByArray(gameData.sellList, "btn", "btn-warning");
            }
            {
                gameData.addGameData(have1.getText());
                gameData.addGameData(have2.getText());
                gameData.addGameData(have3.getText());
                gameData.addGameData(have4.getText());
                gameData.addGameData(have5.getText());
                gameData.addGameData(have6.getText());
                gameData.addGameData(have7.getText());
                gameData.addGameData(have8.getText());
                gameData.addGameData(have9.getText());
                gameData.addGameData(have10.getText());
                gameData.addGameData(have11.getText());
                gameData.addGameData(have12.getText());
                gameData.addGameData(money.getText());
                gameData.addGameData(Health.getText());
                gameData.addGameData(honor.getText());
                gameData.addGameData(storage.getText());
                gameData.addGameData(thinking.getText());
                gameData.addGameData(tired.getText());
                gameData.addGameData(level.getText());
                gameData.addGameData(xp.getText());
                gameData.addGameData(hunger.getText());
            }
            {
                textArrayList.add(have1);
                textArrayList.add(have2);
                textArrayList.add(have3);
                textArrayList.add(have4);
                textArrayList.add(have5);
                textArrayList.add(have6);
                textArrayList.add(have7);
                textArrayList.add(have8);
                textArrayList.add(have9);
                textArrayList.add(have10);
                textArrayList.add(have11);
                textArrayList.add(have12);
                textArrayList.add(money);
                textArrayList.add(Health);
                textArrayList.add(honor);
                textArrayList.add(storage);
                textArrayList.add(thinking);
                textArrayList.add(tired);
                textArrayList.add(level);
                textArrayList.add(xp);
                textArrayList.add(hunger);
            }
            {
                nameDataList.add("have1");
                nameDataList.add("have2");
                nameDataList.add("have3");
                nameDataList.add("have4");
                nameDataList.add("have5");
                nameDataList.add("have6");
                nameDataList.add("have7");
                nameDataList.add("have8");
                nameDataList.add("have9");
                nameDataList.add("have10");
                nameDataList.add("have11");
                nameDataList.add("have12");
                nameDataList.add("money");
                nameDataList.add("Health");
                nameDataList.add("honor");
                nameDataList.add("storage");
                nameDataList.add("thinking");
                nameDataList.add("tired");
                nameDataList.add("level");
                nameDataList.add("xp");
                nameDataList.add("hunger");
            }
            {
                readButton.add(read);
                readButton.add(write);
                gameData.addCssByArray(readButton, "btn", "btn-danger");
            }
            {
                guiSomeButton.add(Sleep);
                guiSomeButton.add(map);
                guiSomeButton.add(update);
                gameData.addCssByArray(guiSomeButton, "btn", "btn-success");
            }

        }
    }

    @FXML private void onMapChick() throws IOException {
        new BSSMap().start(new Stage());
    }

    @FXML private void onSleep() {
        day.setText(String.valueOf(++daySet));
        int healthSet = 100;
        Health.setText(String.valueOf(healthSet));
    }
    @FXML private void onRead() throws FileNotFoundException {
        this.dataSave.read(textArrayList, nameDataList);
    }
    @FXML private void onWrite() throws IOException {
        this.dataSave.write(gameData.getDameData(), nameDataList);
    }

    @FXML private void onUpdate() {

    }

    @FXML private void onBuy1() {
        buySell.onBuy(gameData.moneyData.get(0), 1, have1);
    }
    @FXML private void onBuy2() {
        buySell.onBuy(gameData.moneyData.get(1), 1, have2);
    }
    @FXML private void onBuy3() {
        buySell.onBuy(gameData.moneyData.get(2), 1, have3);
    }
    @FXML private void onBuy4() {
        buySell.onBuy(gameData.moneyData.get(3), 1, have4);
    }
    @FXML private void onBuy5() {
        buySell.onBuy(gameData.moneyData.get(4), 10, have5);
    }
    @FXML private void onBuy6() {
        buySell.onBuy(gameData.moneyData.get(5), 1, have6);
    }
    @FXML private void onBuy7() {
        buySell.onBuy(gameData.moneyData.get(6), 2, have7);
    }
    @FXML private void onBuy8() {
        buySell.onBuy(gameData.moneyData.get(7), 1, have8);
    }
    @FXML private void onBuy9() {
        buySell.onBuy(gameData.moneyData.get(8), 1, have9);
    }
    @FXML private void onBuy10() {
        buySell.onBuy(gameData.moneyData.get(9), 1, have10);
    }
    @FXML private void onBuy11() {
        buySell.onBuy(gameData.moneyData.get(10), 1, have11);
    }
    @FXML private void onBuy12() {
        buySell.onBuy(gameData.moneyData.get(11), 5,have12);
    }
    @FXML private void onSell1() {
        buySell.onSell(gameData.moneyData.get(0), 1, have1);
    }
    @FXML private void onSell2() {
        buySell.onSell(gameData.moneyData.get(1), 1, have2);
    }
    @FXML private void onSell3() {
        buySell.onSell(gameData.moneyData.get(2), 1, have3);
    }
    @FXML private void onSell4() {
        buySell.onSell(gameData.moneyData.get(3), 1, have4);
    }
    @FXML private void onSell5() {
        buySell.onSell(gameData.moneyData.get(4), 10, have5);
    }
    @FXML private void onSell6() {
        buySell.onSell(gameData.moneyData.get(5), 1, have6);
    }
    @FXML private void onSell7() {
        buySell.onSell(gameData.moneyData.get(6), 2, have7);
    }
    @FXML private void onSell8() {
        buySell.onSell(gameData.moneyData.get(7), 1, have8);
    }
    @FXML private void onSell9() {
        buySell.onSell(gameData.moneyData.get(8), 1, have9);
    }
    @FXML private void onSell10() {
        buySell.onSell(gameData.moneyData.get(9), 1, have10);
    }
    @FXML private void onSell11() {
        buySell.onSell(gameData.moneyData.get(10), 1, have11);
    }
    @FXML private void onSell12() {
        buySell.onSell(gameData.moneyData.get(11), 5, have12);
    }
}
