module PruebaComponenteSceneBuilder {
    exports com.javier.views;
    exports com.javier;

    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    requires EjemploComponente;

    opens com.javier.views to javafx.fxml;
}