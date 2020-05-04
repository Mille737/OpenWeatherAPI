package com.kea.weatherrestapi.Repo;


import com.kea.weatherrestapi.Model.Main;
import com.kea.weatherrestapi.Model.WeatherList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherListRepo extends JpaRepository<WeatherList, Integer> {

}
