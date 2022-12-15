package com.niangaoa.YingYe.GameContro;

import javafx.scene.control.Button;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;
import java.util.List;

public class GameData {
    public static List<Integer> buyData = new LinkedList<>();
    public static List<Button> arrayList = new LinkedList<>();

    public GameData() {
        GameData.buyData.add(3000);
        GameData.buyData.add(3500);
        GameData.buyData.add(100000);
        GameData.buyData.add(5000000);
        GameData.buyData.add(200000);
        GameData.buyData.add(50000);
        GameData.buyData.add(100000);
        GameData.buyData.add(25000);
        GameData.buyData.add(10000);
        GameData.buyData.add(1);
        GameData.buyData.add(30000);
        GameData.buyData.add(8000000);
    }

    public static void addButtonToArray(Button button) {
        arrayList.add(button);
    }

    public static void addCssByArray(@NotNull List<Button> buttonArrary, String css) {
        for (Button b :
                buttonArrary) {
            b.getStyleClass().add(css);
        }
    }
}
