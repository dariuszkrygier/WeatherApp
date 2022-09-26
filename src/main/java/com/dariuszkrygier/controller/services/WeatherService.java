package com.dariuszkrygier.controller.services;


import com.dariuszkrygier.model.WeatherDto;



public class WeatherService {

    private final WeatherClient weatherClient;

    public WeatherService(WeatherClient weatherClient) {
        this.weatherClient = weatherClient;
    }


    public WeatherDto getWeather(){

        return weatherClient.getWeatherForCity("Kielce");


    }


}
