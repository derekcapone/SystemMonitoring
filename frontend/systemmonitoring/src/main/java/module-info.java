module com.desktopapp.ui.systemmonitoring {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.desktopapp.ui.systemmonitoring to javafx.fxml;
    exports com.desktopapp.ui.systemmonitoring;
}