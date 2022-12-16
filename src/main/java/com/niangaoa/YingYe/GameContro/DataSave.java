package com.niangaoa.YingYe.GameContro;

import com.niangaoa.YingYe.Ctrller.YingYeGameCtrl;

public class DataSave {
    public static void main(String[] args) {
        YingYeGameCtrl yingYeGameCtrl = new YingYeGameCtrl();
        yingYeGameCtrl.addTextToArray();
        System.out.println(yingYeGameCtrl.gameData.gameDataList.get(0));
    }
}
