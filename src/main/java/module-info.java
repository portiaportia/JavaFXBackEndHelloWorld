module com.helloworld {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;

    opens com.helloworld to javafx.fxml;
    exports com.helloworld;

    opens com.model to javafx.fxml;
    exports com.model;
}
