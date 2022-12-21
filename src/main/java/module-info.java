module com.niangaoa.BusinessSimulator {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.graphics;
    requires javafx.media;
    requires javafx.base;
    requires eu.hansolo.medusa;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires org.jetbrains.annotations;
    requires com.google.gson;

    opens com.niangaoa.BusinessSimulator.Ctrller to javafx.fxml;
    exports com.niangaoa.BusinessSimulator;
    exports com.niangaoa.BusinessSimulator.App;
}