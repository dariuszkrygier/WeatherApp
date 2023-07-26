package com.dariuszkrygier;


import com.dariuszkrygier.view.ViewFactory;
import javafx.application.Application;
import javafx.stage.Stage;


public class App extends Application
{
    public static void main( String[] args ) {
        launch(args);

    }

    @Override
    public void start(Stage stage)  {

        ViewFactory viewFactory = new ViewFactory();
        viewFactory.showMainWindow();


    }
}
