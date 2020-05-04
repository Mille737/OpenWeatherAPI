package com.kea.weatherrestapi.Repo;


import com.kea.weatherrestapi.Model.Main;
import com.kea.weatherrestapi.Model.Sys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRepo extends JpaRepository<Sys, Integer> {

}