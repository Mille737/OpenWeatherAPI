
package com.kea.weatherrestapi.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "wind")
public class Wind implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private Double speed;
    private Integer deg;

    @OneToOne(mappedBy = "wind")
    private Weather weather;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Integer getDeg() {
        return deg;
    }

    public void setDeg(Integer deg) {
        this.deg = deg;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "Wind{" +
                "speed=" + speed +
                ", deg=" + deg +
                ", weather=" + weather +
                '}';
    }
}
