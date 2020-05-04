package com.kea.weatherrestapi.Model;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Clouds")
public class Clouds implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Nullable
    private Integer all;

    public Integer getAll() {
        return all;
    }

    public void setAll(Integer all) {
        this.all = all;
    }

    @OneToOne(mappedBy = "clouds")
    private Weather weather;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "Clouds{" +
                "id=" + id +
                ", all=" + all +
                '}';
    }
}
