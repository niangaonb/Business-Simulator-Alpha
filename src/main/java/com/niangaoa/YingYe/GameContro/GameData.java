package com.niangaoa.YingYe.GameContro;

import javafx.scene.control.Button;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;
import java.util.List;

public class GameData {
    public List<Integer> buyData = new LinkedList<>();
    public List<Button> arrayList = new LinkedList<>();

    public GameData() {
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

    public void addButtonToArray(Button button) {
        arrayList.add(button);
    }

    public void addCssByArray(@NotNull List<Button> buttonArrary, String css) {
        for (Button b :
                buttonArrary) {
            b.getStyleClass().add(css);
        }
    }
}
