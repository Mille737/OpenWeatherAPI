
package com.kea.weatherrestapi.Service;

import com.kea.weatherrestapi.Model.*;
import com.kea.weatherrestapi.Repo.*;
import com.kea.weatherrestapi.WeatherrestapiApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


import java.util.List;

@Service
public class WeatherService {

    @Autowired
    WeatherRepo weatherRepo;

    @Autowired
    CoordRepo coordRepo;

    @Autowired
    MainRepo mainRepo;

    @Autowired
    CloudsRepo cloudsRepo;

    @Autowired
    SysRepo sysRepo;

    @Autowired
    WeatherListRepo weatherListRepo;

    @Autowired
    WindRepo windRepo;

    //private static final Logger log = LoggerFactory.getLogger(WeatherrestapiApplication.class);
   // private RestTemplate restTemplate;

    public List<Weather> displayWeather() {
        return weatherRepo.findAll();
    }
    public List<Coord> displayCoord() {
        return coordRepo.findAll();
    }
    public List<Main> displayMain() {
        return mainRepo.findAll();
    }

    //RestTemplate restTemplate;
/*
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

 */

    /*public void insert(Coord coord, Clouds clouds, Main main, Sys sys, List<WeatherList> weatherList, Wind wind, Weather weather) throws Exception {
       //weatherrestapiApplication.run(restTemplate);
       //log.info(weather.toString());

        weather = restTemplate.getForObject(
                "http://api.openweathermap.org/data/2.5/weather?q=copenhagen&appid=bdf870f0163fa263f682e20eb10c8a5a", Weather.class);
        log.info(weather.toString());

        coordRepo.save(weather.getCoord());
        cloudsRepo.save(weather.getClouds());
        mainRepo.save(weather.getMain());
        sysRepo.save(weather.getSys());
        weatherListRepo.saveAll(weather.getWeatherList());
        windRepo.save(weather.getWind());
        weatherRepo.save(weather);




    }*/
    
    private RestTemplate restTemplate;

    private String api_url = "http://api.openweathermap.org/data/2.5/weather?q=copenhagen&appid=bdf870f0163fa263f682e20eb10c8a5a";

    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void insert(Coord coord, Clouds clouds, Main main, Sys sys, List<WeatherList> weatherList, Wind wind, Weather weather) {

        UriComponentsBuilder uriBuilder = UriComponentsBuilder
                .fromUriString(api_url);
                //.queryParam("limit", limit);

        Weather weather1 = restTemplate.getForObject(uriBuilder.toUriString(), Weather.class);
        coordRepo.save(weather.getCoord());
        cloudsRepo.save(weather.getClouds());
        mainRepo.save(weather.getMain());
        sysRepo.save(weather.getSys());
        weatherListRepo.saveAll(weather.getWeatherList());
        windRepo.save(weather.getWind());
        weatherRepo.save(weather1);
    }

}
