package com.dariuszkrygier;


import com.dariuszkrygier.controller.services.FetchWeatherService;
import com.dariuszkrygier.view.ViewFactory;
import javafx.application.Application;
import javafx.stage.Stage;
import net.aksingh.owmjapis.api.APIException;

public class App extends Application
{
    public static void main( String[] args ) throws APIException {
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {

        ViewFactory viewFactory = new ViewFactory(new WeatherManager());
        viewFactory.showMainWindow();


    }
}
