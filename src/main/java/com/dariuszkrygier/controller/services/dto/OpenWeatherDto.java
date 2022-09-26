package com.dariuszkrygier.controller.services.dto;



public class OpenWeatherDto {
    private OpenWeatherMainDto main;
    private OpenWeatherWeatherDto weather;

    public OpenWeatherMainDto getMain() {
        return main;
    }

    public OpenWeatherWeatherDto getWeather() {
        return weather;
    }


}
