package com.dariuszkrygier.controller;

import com.dariuszkrygier.WeatherManager;
import com.dariuszkrygier.view.ViewFactory;

public abstract class BaseController {

    protected WeatherManager weatherManager;
    protected ViewFactory viewFactory;
    private String fxmlName;

    public BaseController(WeatherManager weatherManager, ViewFactory viewFactory, String fxmlName) {
        this.weatherManager = weatherManager;
        this.viewFactory = viewFactory;
        this.fxmlName = fxmlName;
    }



    public String getFxmlName() {
        return fxmlName;
    }
}
