package com.kea.weatherrestapi.Repo;

import com.kea.weatherrestapi.Model.Coord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoordRepo extends JpaRepository<Coord, Integer> {

}