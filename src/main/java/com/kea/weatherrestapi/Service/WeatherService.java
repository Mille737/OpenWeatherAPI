
package com.kea.weatherrestapi.Service;

import com.kea.weatherrestapi.Model.Coord;
import com.kea.weatherrestapi.Model.Main;
import com.kea.weatherrestapi.Model.Weather;
import com.kea.weatherrestapi.Repo.CoordRepo;
import com.kea.weatherrestapi.Repo.MainRepo;
import com.kea.weatherrestapi.Repo.WeatherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherService {

    @Autowired
    WeatherRepo weatherRepo;

    @Autowired
    CoordRepo coordRepo;

    @Autowired
    MainRepo mainRepo;

    public List<Weather> displayWeather() {
        return weatherRepo.findAll();
    }

    public List<Coord> displayCoord() {
        return coordRepo.findAll();
    }
    public List<Main> displayMain() {
        return mainRepo.findAll();
    }

/*

    public void insert(Weather weather){
        weatherRepo.save(weather);
    }
*/
}
