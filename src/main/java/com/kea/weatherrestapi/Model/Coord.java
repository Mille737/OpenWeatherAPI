
package com.kea.weatherrestapi.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Coord")
public class Coord implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    private Double lon;
    private Double lat;
    @OneToOne(mappedBy = "coord")
    private Weather weather;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "Coord{" +
                "lon=" + lon +
                ", lat=" + lat +
                ", weather=" + weather +
                '}';
    }
}
