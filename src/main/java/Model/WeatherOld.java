package Model;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

public class WeatherOld {

    private int weatherId;
    private int temp;
    private String clouds;
    private int pressure;
    private int humidity;
    private String sunrise;
    private String sunset;
    private LocalDateTime time;
    public WeatherOld() {
    }
    public WeatherOld(int weatherId, int temp, String clouds, int pressure, int humidity, String sunrise, String sunset, LocalDateTime time){
        this.weatherId = weatherId;
        this.temp = temp;
        this.clouds = clouds;
        this.pressure = pressure;
        this.humidity = humidity;
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.time = time;
    }
    public int getWeatherId() {
        return weatherId;
    }
    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }
    public int getTemp() {
        return temp;
    }
    public void setTemp(int temp) {
        this.temp = temp;
    }
    public String getClouds() {
        return clouds;
    }
    public void setClouds(String clouds) {
        this.clouds = clouds;
    }
    public int getPressure() {
        return pressure;
    }
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
    public int getHumidity() {
        return humidity;
    }
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
    public String getSunrise() {
        return sunrise;
    }
    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }
    public String getSunset() {
        return sunset;
    }
    public void setSunset(String sunset) {
        this.sunset = sunset;
    }
    public LocalDateTime getTime() {
        return time;
    }
    public void setTime(LocalDateTime time) {
        this.time = time;
    }
    @Override
    public String toString() {
        return "Weather{" +
                "weatherId=" + weatherId +
                ", temp=" + temp +
                ", clouds='" + clouds + '\'' +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", sunrise='" + sunrise + '\'' +
                ", sunset='" + sunset + '\'' +
                ", time=" + time +
                '}';
    }
}
