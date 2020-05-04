package com.kea.weatherrestapi.Controller;

import com.kea.weatherrestapi.Model.Weather;
import com.kea.weatherrestapi.Service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WeatherController {

    @Autowired
    WeatherService weatherService;


    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("weatherList", weatherService.displayWeather());
        model.addAttribute("coordList", weatherService.displayCoord());
        model.addAttribute("mainList", weatherService.displayMain());
        return "/index";
    }


    @PostMapping("/index")
    public String saveData(@ModelAttribute Weather weather) throws Exception {
        weatherService.insert(weather.getCoord(), weather.getClouds(), weather.getMain(),weather.getSys(), weather.getWeatherList(), weather.getWind(), weather);
        return "/index22";
    }


}
