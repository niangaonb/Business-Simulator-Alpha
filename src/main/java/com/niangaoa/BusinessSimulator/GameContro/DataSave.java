package com.niangaoa.BusinessSimulator.GameContro;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import javafx.scene.control.Label;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class DataSave {
    private final JsonObject jsonObject = new JsonObject();
    public void write(@NotNull List<String> dataList, List<String> nameList) throws IOException {
        File file = new File("saves.json");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        OutputStreamWriter outputStream = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
        for (int i = 0; i < dataList.size(); i++) {
            jsonObject.addProperty(nameList.get(i), dataList.get(i));
        }
        outputStream.append(jsonObject.toString());
        outputStream.close();
        fileOutputStream.close();
    }

    public void read(List<Label> textList, List<String> nameList) throws FileNotFoundException {
        JsonObject jsonObject1 = (JsonObject) JsonParser.parseReader(new FileReader("saves.json"));
        for (int i = 0; i < textList.size(); i++) {
            textList.get(i).setText(jsonObject1.get(nameList.get(i)).getAsString());
        }
    }
}
