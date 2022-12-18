package com.niangaoa.BusinessSimulator.Ctrller;


import com.niangaoa.BusinessSimulator.App.BSSMap;
import com.niangaoa.BusinessSimulator.GameContro.BuySell;
import com.niangaoa.BusinessSimulator.GameContro.GameData;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class BSSGameCtrl implements Initializable {
    @FXML
    public Text honor = new Text();
    @FXML
    public Text tired = new Text();
    @FXML
    public Text level = new Text();
    @FXML
    public Text xp = new Text();
    @FXML
    public Text hunger = new Text();
    @FXML
    public Text thinking = new Text();
    @FXML
    private GridPane gridPane;
    @FXML
    public Text storage = new Text();
    @FXML
    private Button write;
    @FXML
    private Button read;

    @FXML
    private Text have1;
    @FXML
    public Text have2;
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


    @FXML
    private Button buy1;
    @FXML
    private Button buy2;
    @FXML
    private Button buy3;
    @FXML
    private Button buy4;
    @FXML
    private Button buy5;
    @FXML
    private Button buy6;
    @FXML
    private Button buy7;
    @FXML
    private Button buy8;
    @FXML
    private Button buy9;
    @FXML
    private Button buy10;
    @FXML
    private Button buy11;
    @FXML
    private Button buy12;

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
    public Text money;


    @FXML
    private Button Sleep;


    @FXML
    private Text day;


    @FXML
    private Button map;


    private int daySet = 1;

    @FXML
    private Pane pane;

    private final List<String> gameDataList = new ArrayList<>();
    private final BuySell buySell = new BuySell();
    public GameData gameData = new GameData();

    @FXML
    private void onMapChick() throws IOException {
        new BSSMap().start(new Stage());
    }

    @FXML
    private void onSleep() {
        day.setText(String.valueOf(++daySet));
        int healthSet = 100;
        Health.setText(String.valueOf(healthSet));
    }

    @FXML
    private void onBuy1() {
        buySell.onBuy(gameData.moneyData.get(0), 1, have1);
    }

    @FXML
    private void onBuy2() {
        buySell.onBuy(gameData.moneyData.get(1), 1, have2);
    }
    @FXML
    private void onBuy3() {
        buySell.onBuy(gameData.moneyData.get(2), 1, have3);
    }
    @FXML
    private void onBuy4() {
        buySell.onBuy(gameData.moneyData.get(3), 1, have4);
    }
    @FXML
    private void onBuy5() {
        buySell.onBuy(gameData.moneyData.get(4), 10, have5);
    }
    @FXML
    private void onBuy6() {
        buySell.onBuy(gameData.moneyData.get(5), 10, have6);
    }
    @FXML
    private void onBuy7() {
        buySell.onBuy(gameData.moneyData.get(6), 2, have7);
    }
    @FXML
    private void onBuy8() {
        buySell.onBuy(gameData.moneyData.get(7), 1, have8);
    }
    @FXML
    private void onBuy9() {
        buySell.onBuy(gameData.moneyData.get(8), 1, have9);
    }
    @FXML
    private void onBuy10() {
        buySell.onBuy(gameData.moneyData.get(9), 1, have10);
    }
    @FXML
    private void onBuy11() {
        buySell.onBuy(gameData.moneyData.get(10), 1, have11);
    }
    @FXML
    private void onBuy12() {
        buySell.onBuy(gameData.moneyData.get(11), 1,have12);
    }
    @FXML
    private void onSell1() {
        buySell.onSell(gameData.moneyData.get(0), 1, have1);
    }
    @FXML
    private void onSell2() {
        buySell.onSell(gameData.moneyData.get(1), 1, have2);
    }
    @FXML
    private void onSell3() {
        buySell.onSell(gameData.moneyData.get(2), 1, have3);
    }
    @FXML
    private void onSell4() {
        buySell.onSell(gameData.moneyData.get(3), 1, have4);
    }
    @FXML
    private void onSell5() {
        buySell.onSell(gameData.moneyData.get(4), 10, have5);
    }
    @FXML
    private void onSell6() {
        buySell.onSell(gameData.moneyData.get(5), 1, have6);
    }
    @FXML
    private void onSell7() {
        buySell.onSell(gameData.moneyData.get(6), 2, have7);
    }
    @FXML
    private void onSell8() {
        buySell.onSell(gameData.moneyData.get(7), 1, have8);
    }
    @FXML
    private void onSell9() {
        buySell.onSell(gameData.moneyData.get(8), 1, have9);
    }
    @FXML
    private void onSell10() {
        buySell.onSell(gameData.moneyData.get(9), 1, have10);
    }
    @FXML
    private void onSell11() {
        buySell.onSell(gameData.moneyData.get(10), 1, have11);
    }
    @FXML
    private void onSell12() {
        buySell.onSell(gameData.moneyData.get(11), 5, have12);
    }

    @FXML
    private void onRead() {
    }

    @FXML
    private void onWrite() {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
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
            addGameData(have1.getText());
            addGameData(have2.getText());
            addGameData(have3.getText());
            addGameData(have4.getText());
            addGameData(have5.getText());
            addGameData(have6.getText());
            addGameData(have7.getText());
            addGameData(have8.getText());
            addGameData(have9.getText());
            addGameData(have10.getText());
            addGameData(have11.getText());
            addGameData(have12.getText());
            addGameData(money.getText());
            addGameData(Health.getText());
            addGameData(honor.getText());
            addGameData(storage.getText());
            addGameData(thinking.getText());
            addGameData(tired.getText());
            addGameData(level.getText());
            addGameData(xp.getText());
            addGameData(hunger.getText());
        }
        day.setText(String.valueOf(daySet));
        int moneySet = 50000000;
        money.setText(String.valueOf(moneySet));
        storage.setText(String.valueOf(3000));
        buySell.setMoney(money);
        buySell.setStorage(storage);
    }
    private void addGameData(String gameData) {
        gameDataList.add(gameData);
    }
}
