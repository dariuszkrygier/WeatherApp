package com.dariuszkrygier.controller.services.dto;

import javafx.scene.image.Image;

public class OpenWeatherWeatherDto {
    private String description;

    public String getDescription() {
        return description;
    }

    public Image getIcon() {
        return icon;
    }

    private Image icon;
}
