package com.dariuszkrygier.controller.services;
import com.dariuszkrygier.controller.services.dto.OpenWeatherDto;
import com.dariuszkrygier.model.WeatherDto;
import org.springframework.web.client.RestTemplate;


public class WeatherClient {

    private static final String WEATHER_URL = "https://api.openweathermap.org/data/2.5/";
    private static final String API_KEY = "0ba49489903c4598b912b5f5f80c5f46";
    private RestTemplate restTemplate = new RestTemplate();

    public WeatherDto getWeatherForCity(String city) {
        OpenWeatherDto openWeatherDto = callGetMethod("weather?q={city}&appid={apiKey}&units=metric&lang=pl",
                OpenWeatherDto.class,
                city, API_KEY);

        return new WeatherDto(openWeatherDto.getWeather().getIcon(), openWeatherDto.getMain().getTemp(),openWeatherDto.getWeather().getDescription() );

    }

    public String getForecast(double lat, double lon) {
        return callGetMethod("onecall?lat={lat}&lon={lon}&exclude=minutely,hourly&appid={apiKey}&units=metric&lang=pl",
                String.class,
                lat, lon, API_KEY);
    }

    private <T> T callGetMethod(String url, Class<T> responseType, Object... objects) {
        return restTemplate.getForObject(WEATHER_URL + url, responseType, objects);
    }
}
