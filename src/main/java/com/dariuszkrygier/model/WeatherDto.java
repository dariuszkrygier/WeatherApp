package com.dariuszkrygier.model;

import javafx.scene.image.Image;


public class WeatherDto {
    private Image icon;
    private Float temperature;
    private  String description;



    public WeatherDto(Image icon, Float temperature, String description) {
        this.icon = icon;
        this.temperature = temperature;
        this.description = description;
    }

    public Image getIcon() {
        return icon;
    }



    public Float getTemperature() {
        return temperature;
    }

    public String getDescription() {
        return description;
    }




}
