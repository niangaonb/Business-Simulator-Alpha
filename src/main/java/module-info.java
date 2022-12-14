module com.niangaoa.YingYe {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.niangaoa.YingYe.Ctrller to javafx.fxml;
    exports com.niangaoa.YingYe;
    exports com.niangaoa.YingYe.App;
}