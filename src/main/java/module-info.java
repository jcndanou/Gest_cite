module com.example.gest_cite {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.gest_cite to javafx.fxml;
    exports com.example.gest_cite;
}