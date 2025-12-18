module com.darvinsystems.metodosdebusqueda1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.darvinsystems.metodosdebusqueda1 to javafx.fxml;
    exports com.darvinsystems.metodosdebusqueda1;
    exports com.darvinsystems.metodosdebusqueda1.controller;
    opens com.darvinsystems.metodosdebusqueda1.controller to javafx.fxml;
}