module WeatherApp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
   // requires javafx.web;
    //requires javafx.base;
    requires owm.japis;
    requires java.sql;
   // requires org.json;
   // requires spring.web;
   // requires spring.context;
    //requires lombok;
    requires gson;
    requires org.controlsfx.controls;

    opens com.dariuszkrygier to javafx.fxml;
    opens com.dariuszkrygier.controller to javafx.fxml;
    opens com.dariuszkrygier.view to javafx.fxml;
    opens com.dariuszkrygier.model to javafx.fxml, gson;

    exports com.dariuszkrygier;
}