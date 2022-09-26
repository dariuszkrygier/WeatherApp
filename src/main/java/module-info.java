module WeatherApp {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires javafx.base;
    requires owm.japis;
    requires org.json;
    requires spring.web;
    requires spring.context;
    requires lombok;

    opens com.dariuszkrygier to javafx.fxml;
    exports com.dariuszkrygier;
    opens com.dariuszkrygier.controller;
    exports com.dariuszkrygier.controller;
    opens com.dariuszkrygier.view to javafx.fxml;

}