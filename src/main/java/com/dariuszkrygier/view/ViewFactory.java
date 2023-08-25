package com.dariuszkrygier.view;

import com.dariuszkrygier.controller.BaseController;
import com.dariuszkrygier.controller.MainWindowController;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewFactory {
/*
    private WeatherManager weatherManager;

    public ViewFactory(WeatherManager weatherManager) {
        this.weatherManager = weatherManager;
    }
*/

    public void showMainWindow(){
        BaseController controller = new MainWindowController( this, "/com/dariuszkrygier/view/MainWindow.fxml");
       initializeStage(controller);
    }

        private void initializeStage(BaseController controller){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(controller.getFxmlName()));
        fxmlLoader.setController(controller);
        Parent parent;
        try {
            parent = fxmlLoader.load();
        }catch(IOException e){
            e.printStackTrace();
            return;
        }

        Scene scene = new Scene(parent);
        scene.getStylesheets().add(getClass().getResource("css/default.css").toExternalForm());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}

