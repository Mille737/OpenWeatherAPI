
package com.kea.weatherrestapi.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "main")
public class Main implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private Double temp;
    private Double feelsLike;
    private Double tempMin;
    private Double tempMax;
    private Integer pressure;
    private Integer humidity;

    @OneToOne(mappedBy = "main")
    private Weather weather;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(Double feelsLike) {
        this.feelsLike = feelsLike;
    }

    public Double getTempMin() {
        return tempMin;
    }

    public void setTempMin(Double tempMin) {
        this.tempMin = tempMin;
    }

    public Double getTempMax() {
        return tempMax;
    }

    public void setTempMax(Double tempMax) {
        this.tempMax = tempMax;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "Main{" +
                "temp=" + temp +
                ", feelsLike=" + feelsLike +
                ", tempMin=" + tempMin +
                ", tempMax=" + tempMax +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", weather=" + weather +
                '}';
    }
}
