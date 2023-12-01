module com.systemmonitoring.frontend.systemmonitoringfrontend {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.systemmonitoring.frontend.systemmonitoringfrontend to javafx.fxml;
    exports com.systemmonitoring.frontend.systemmonitoringfrontend;
}