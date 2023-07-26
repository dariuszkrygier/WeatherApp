package com.dariuszkrygier.controller;

import com.dariuszkrygier.model.CityReader;
import com.dariuszkrygier.model.WeatherForecastFetcher;
import com.dariuszkrygier.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import net.aksingh.owmjapis.api.APIException;
import org.controlsfx.control.textfield.TextFields;

import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController extends BaseController implements Initializable {

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

    public MainWindowController(ViewFactory viewFactory, String fxmlName) {
        super(viewFactory, fxmlName);
        cityReader = new CityReader();
        weatherForecastFetcher = new WeatherForecastFetcher("0ba49489903c4598b912b5f5f80c5f46");
    }


    @FXML
    void changeFirstCityLocationButtonAction() throws APIException {
        if (firstFieldIsValid()) {
            showCurrentWeather(firstCityPicker, firstCity, firstCityFirstDayDate, firstCityFirstDayImage,
                    firstCityFirstDayTemp, firstCityFirstDayDescription );
            //day2
            showNextDays(firstCityPicker, 8, firstCitySecondDayDate, firstCitySecondDayImage,
                    firstCitySecondDayTemp, firstCitySecondDayDescription);
            //day3
            showNextDays(firstCityPicker, 16, firstCityThirdDayDate, firstCityThirdDayImage,
                    firstCityThirdDayTemp, firstCityThirdDayDescription);
            //day4
            showNextDays(firstCityPicker, 24, firstCityFourthDayDate, firstCityFourthDayImage,
                    firstCityFourthDayTemp, firstCityFourthDayDescription);
            //day5
            showNextDays(firstCityPicker, 32, firstCityFifthDayDate, firstCityFifthDayImage,
                    firstCityFifthDayTemp, firstCityFifthDayDescription);
        }
    }

    @FXML
    void changeSecondCityLocationButtonAction() throws APIException{
        if (secondFieldIsValid()) {
            showCurrentWeather(SecondCityPicker, secondCity, secondCityFirstDayDate, secondCityFirstDayImage,
                    secondCityFirstDayTemp, secondCityFirstDayDescription );
            //day2
            showNextDays(SecondCityPicker, 8, secondCitySecondDayDate, secondCitySecondDayImage,
                    secondCitySecondDayTemp, secondCitySecondDayDescription);
            //day3
            showNextDays(SecondCityPicker, 16, secondCityThirdDayDate, secondCityThirdDayImage,
                    secondCityThirdDayTemp, secondCityThirdDayDescription);
            //day4
            showNextDays(SecondCityPicker, 24, secondCityFourthDayDate, secondCityFourthDayImage,
                    secondCityFourthDayTemp, secondCityFourthDayDescription);
            //day5
            showNextDays(SecondCityPicker, 32, secondCityFifthDayDate, secondCityFifthDayImage,
                    secondCityFifthDayTemp, secondCityFifthDayDescription);
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setStartView();
        TextFields.bindAutoCompletion(firstCityPicker, cityReader.getCityNameWithCountryCodeMap().values());
        TextFields.bindAutoCompletion(SecondCityPicker, cityReader.getCityNameWithCountryCodeMap().values());

    }
    private void setStartView() {
        try {
            firstCityPicker.setText("Kielce, PL");
            SecondCityPicker.setText("Crete, GR");
            showCurrentWeather(firstCityPicker, firstCity, firstCityFirstDayDate, firstCityFirstDayImage,
                    firstCityFirstDayTemp, firstCityFirstDayDescription );
            //day2
            showNextDays(firstCityPicker, 8, firstCitySecondDayDate, firstCitySecondDayImage,
                    firstCitySecondDayTemp, firstCitySecondDayDescription);
            //day3
            showNextDays(firstCityPicker, 16, firstCityThirdDayDate, firstCityThirdDayImage,
                    firstCityThirdDayTemp, firstCityThirdDayDescription);
            //day4
            showNextDays(firstCityPicker, 24, firstCityFourthDayDate, firstCityFourthDayImage,
                    firstCityFourthDayTemp, firstCityFourthDayDescription);
            //day5
            showNextDays(firstCityPicker, 32, firstCityFifthDayDate, firstCityFifthDayImage,
                    firstCityFifthDayTemp, firstCityFifthDayDescription);
            showCurrentWeather(SecondCityPicker, secondCity, secondCityFirstDayDate, secondCityFirstDayImage,
                    secondCityFirstDayTemp, secondCityFirstDayDescription );
            //day2
            showNextDays(SecondCityPicker, 8, secondCitySecondDayDate, secondCitySecondDayImage,
                    secondCitySecondDayTemp, secondCitySecondDayDescription);
            //day3
            showNextDays(SecondCityPicker, 16, secondCityThirdDayDate, secondCityThirdDayImage,
                    secondCityThirdDayTemp, secondCityThirdDayDescription);
            //day4
            showNextDays(SecondCityPicker, 24, secondCityFourthDayDate, secondCityFourthDayImage,
                    secondCityFourthDayTemp, secondCityFourthDayDescription);
            //day5
            showNextDays(SecondCityPicker, 32, secondCityFifthDayDate, secondCityFifthDayImage,
                    secondCityFifthDayTemp, secondCityFifthDayDescription);
        } catch (APIException e) {
            e.printStackTrace();
        }
    }
    private void showCurrentWeather(TextField locationField, Label locationName, Label locationDate,
                                    ImageView locationImage, Label locationTemp, Label locationWeather
                                    ) throws APIException {

        var weather = weatherForecastFetcher.getWeatherForecast(locationField.getText());
        int currentTimeIndex = 0;

        String cityNameWithCountryCode = weather.getCityName() + ", " + weather .getCountryCode();
        String dateWithDay =
                weather.getDayOfTheWeek(currentTimeIndex) + ", " + weather.getDateWithoutTime(currentTimeIndex);
        Image image = new Image(weather .getIconLink(currentTimeIndex));
        String temp = weather .getTemp(currentTimeIndex);
        String description = weather .getDescription(currentTimeIndex);

        locationName.setText(cityNameWithCountryCode);
        locationDate.setText(dateWithDay);
        locationImage.setImage(image);
        locationTemp.setText(temp);
        locationWeather.setText(description);

    }

    private void showNextDays(TextField locationField, int timeIndex, Label locationDate,
                              ImageView locationImage, Label locationTemp, Label locationWeather) throws APIException {


        var weather = weatherForecastFetcher.getWeatherForecast(locationField.getText());
        //int currentTimeIndex = 0;
        String dateWithDay =
                weather.getDayOfTheWeek(timeIndex) + ", " + weather.getDateWithoutTime(timeIndex);
        Image image = new Image(weather .getIconLink(timeIndex));
        String temp = weather .getTemp(timeIndex);
        String description = weather .getDescription(timeIndex);


        locationDate.setText(dateWithDay);
        locationImage.setImage(image);
        locationTemp.setText(temp);
        locationWeather.setText(description);



        }


    private boolean firstFieldIsValid() {
        if(firstCityPicker.getText().isEmpty()) {
            firstCityErrorLabel.setText("Please enter the first city");
            return false;
        }
        firstCityPicker.setText("");
        return true;
    }

    private boolean secondFieldIsValid() {
        if(SecondCityPicker.getText().isEmpty()) {
            SecondCityPicker.setText("Please enter the second city");
            return false;
        }
        secondCityErrorLabel.setText("");
        return true;
    }


}
