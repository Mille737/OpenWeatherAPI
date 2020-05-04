
package com.kea.weatherrestapi.Service;

import com.kea.weatherrestapi.Model.Main;
import com.kea.weatherrestapi.Model.Weather;
import com.kea.weatherrestapi.Repo.WeatherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherService {

    @Autowired
    WeatherRepo weatherRepo;

    public List<Main> display() {
        return weatherRepo.findAll();
    }

/*
    public void insert(Weather weather){
        weatherRepo.save(weather);
    }
*/
}
