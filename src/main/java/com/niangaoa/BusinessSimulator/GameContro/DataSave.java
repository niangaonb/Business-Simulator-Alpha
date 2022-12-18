package com.niangaoa.BusinessSimulator.GameContro;

import com.niangaoa.BusinessSimulator.Ctrller.BSSGameCtrl;

public class DataSave {
    public static void main(String[] args) {
        BSSGameCtrl BSSGameCtrl = new BSSGameCtrl();
        BSSGameCtrl.addTextToArray();
        System.out.println(BSSGameCtrl.gameData.gameDataList.get(0));
    }
}
