package com.niangaoa.BusinessSimulator.GameContro;

import javafx.scene.control.Label;
import org.jetbrains.annotations.NotNull;

public class BuySell {
    private Label money;
    private Label storage;

    public void onBuy(int buySet, int storageNeed,@NotNull Label have) {
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

    public void onSell(int sellMoney, int storageNeed, @NotNull Label have) {
        int moneyGet = Integer.parseInt(money.getText());
        int storageGet = Integer.parseInt(storage.getText());
        int haveGet = Integer.parseInt(have.getText());
        if (Integer.parseInt(have.getText()) > 0) {
            money.setText(String.valueOf(moneyGet + sellMoney));
            storage.setText(String.valueOf(storageGet + storageNeed));
            have.setText(String.valueOf(haveGet - 1));
        }
    }

    public void setMoney(Label moneySet) {
        this.money = moneySet;
    }

    public void setStorage(Label storageSet) {
        this.storage = storageSet;
    }

    public String getMoney() {
        return money.getText();
    }

    public String getStorage() {
        return storage.getText();
    }
}
