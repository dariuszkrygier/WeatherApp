package com.dariuszkrygier.controller.services;

import net.aksingh.owmjapis.api.APIException;
import net.aksingh.owmjapis.core.OWM;
import net.aksingh.owmjapis.model.CurrentWeather;
public class FetchWeatherService {
    // declaring object of "OWM" class
    OWM owm = new OWM("Y0ba49489903c4598b912b5f5f80c5f46");

    // getting current weather data for the "London" city
    CurrentWeather cwd = owm.currentWeatherByCityName("London");



    public FetchWeatherService() throws APIException {
    }

    public void showWeather(){
    //printing city name from the retrieved data
        System.out.println("City: " + cwd.getCityName());

    // printing the max./min. temperature
        System.out.println("Temperature: " + cwd.getMainData().getTempMax()
                            + "/" + cwd.getMainData().getTempMin() + "\'K");
}
}
