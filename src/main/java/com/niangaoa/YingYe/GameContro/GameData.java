package com.niangaoa.YingYe.GameContro;

import javafx.scene.control.Button;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class GameData {
    public List<Integer> moneyData = new ArrayList<>();
    public List<Button> buyList = new ArrayList<>();
    public List<Button> sellList = new ArrayList<>();
    public List<String> gameDataList = new ArrayList<>();

    public GameData() {
        moneyData.add(3000);
        moneyData.add(3500);
        moneyData.add(100000);
        moneyData.add(5000000);
        moneyData.add(200000);
        moneyData.add(50000);
        moneyData.add(100000);
        moneyData.add(25000);
        moneyData.add(10000);
        moneyData.add(1);
        moneyData.add(30000);
        moneyData.add(8000000);
    }

    public void addButtonToBuyArray(Button button) {
        this.buyList.add(button);
    }

    public void addButtonToSellArray(Button button) {
        this.sellList.add(button);
    }

    public void addCssByArray(@NotNull List<Button> buttonArrary, String css1, String css2) {
        for (Button b :
                buttonArrary) {
            b.getStyleClass().addAll(css1, css2);
        }
    }

    public void addGameData(String gameData) {
        this.gameDataList.add(gameData);
    }

    public List<String> getGameDataList() {
        return gameDataList;
    }
}
