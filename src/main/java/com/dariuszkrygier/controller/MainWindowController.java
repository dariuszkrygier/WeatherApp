package com.dariuszkrygier.controller;

import com.dariuszkrygier.WeatherManager;
import com.dariuszkrygier.model.CityReader;
import com.dariuszkrygier.model.WeatherForecastFetcher;
import com.dariuszkrygier.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class MainWindowController extends BaseController {

    @FXML
    private TextField SecondCityPicker;

    @FXML
    private Label firstCity;

    @FXML
    private Label firstCityErrorLabel;

    @FXML
    private Label firstCityFifthDayDate;

    @FXML
    private Label firstCityFifthDayDescription;

    @FXML
    private ImageView firstCityFifthDayImage;

    @FXML
    private Pane firstCityFifthDayPane;

    @FXML
    private Label firstCityFifthDayTemp;

    @FXML
    private Label firstCityFirstDayDate;

    @FXML
    private Label firstCityFirstDayDescription;

    @FXML
    private ImageView firstCityFirstDayImage;

    @FXML
    private Pane firstCityFirstDayPane;

    @FXML
    private Label firstCityFirstDayTemp;

    @FXML
    private Label firstCityFourthDayDate;

    @FXML
    private Label firstCityFourthDayDescription;

    @FXML
    private ImageView firstCityFourthDayImage;

    @FXML
    private Pane firstCityFourthDayPane;

    @FXML
    private Label firstCityFourthDayTemp;

    @FXML
    private TextField firstCityPicker;

    @FXML
    private Label firstCitySecondDayDate;

    @FXML
    private Label firstCitySecondDayDescription;

    @FXML
    private ImageView firstCitySecondDayImage;

    @FXML
    private Pane firstCitySecondDayPane;

    @FXML
    private Label firstCitySecondDayTemp;

    @FXML
    private Label firstCityThirdDayDate;

    @FXML
    private Label firstCityThirdDayDescription;

    @FXML
    private ImageView firstCityThirdDayImage;

    @FXML
    private Pane firstCityThirdDayPane;

    @FXML
    private Label firstCityThirdDayTemp;

    @FXML
    private Label secondCity;

    @FXML
    private Label secondCityErrorLabel;

    @FXML
    private Label secondCityFifthDayDate;

    @FXML
    private Label secondCityFifthDayDescription;

    @FXML
    private ImageView secondCityFifthDayImage;

    @FXML
    private Pane secondCityFifthDayPane;

    @FXML
    private Label secondCityFifthDayTemp;

    @FXML
    private Label secondCityFirstDayDate;

    @FXML
    private Label secondCityFirstDayDescription;

    @FXML
    private ImageView secondCityFirstDayImage;

    @FXML
    private Pane secondCityFirstDayPane;

    @FXML
    private Label secondCityFirstDayTemp;

    @FXML
    private Label secondCityFourthDayDate;

    @FXML
    private Label secondCityFourthDayDescription;

    @FXML
    private ImageView secondCityFourthDayImage;

    @FXML
    private Pane secondCityFourthDayPane;

    @FXML
    private Label secondCityFourthDayTemp;

    @FXML
    private Label secondCitySecondDayDate;

    @FXML
    private Label secondCitySecondDayDescription;

    @FXML
    private ImageView secondCitySecondDayImage;

    @FXML
    private Pane secondCitySecondDayPane;

    @FXML
    private Label secondCitySecondDayTemp;

    @FXML
    private Label secondCityThirdDayDate;

    @FXML
    private Label secondCityThirdDayDescription;

    @FXML
    private ImageView secondCityThirdDayImage;

    @FXML
    private Pane secondCityThirdDayPane;

    @FXML
    private Label secondCityThirdDayTemp;

    private final CityReader cityReader;
    private final WeatherForecastFetcher weatherForecastFetcher;

    public MainWindowController(WeatherManager weatherManager, ViewFactory viewFactory, String fxmlName) {
        super(weatherManager, viewFactory, fxmlName);
        cityReader = new CityReader();
        weatherForecastFetcher = new WeatherForecastFetcher("0ba49489903c4598b912b5f5f80c5f46");
    }


    @FXML
    void changeFirstCityLocationButtonAction() {

    }

    @FXML
    void changeSecondCityLocationButtonAction() {

    }




}
