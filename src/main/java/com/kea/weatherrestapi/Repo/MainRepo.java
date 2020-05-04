package com.kea.weatherrestapi.Repo;

import com.kea.weatherrestapi.Model.Coord;
import com.kea.weatherrestapi.Model.Main;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainRepo extends JpaRepository<Main, Integer> {

}