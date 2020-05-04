
package com.kea.weatherrestapi.Model;

//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "weather")
public class Weather implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Coord_id", referencedColumnName = "id")
    private Coord coord;

    private String base;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Main_id", referencedColumnName = "id")
    private Main main;
    private Integer visibility;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Wind_id", referencedColumnName = "id")
    private Wind wind;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "clouds_id", referencedColumnName = "id")
    private Clouds clouds;


    private Integer dt;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sys_id", referencedColumnName = "id")
    private Sys sys;
    private Integer timezone;
    private String name;
    private Integer cod;

    @OneToMany(mappedBy = "weather", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
   // @JoinColumn(name = "weatherList_id", referencedColumnName = "id")
    private List<WeatherList> weatherList;


    private LocalDateTime dateTime = LocalDateTime.now();


    public Weather() {
    }

    public Weather(Coord coord, String base, Main main, Integer visibility, Wind wind, Clouds clouds, Integer dt, Sys sys, Integer timezone, Integer id, String name, Integer cod, List<WeatherList> weatherList) {
        this.coord = coord;
        this.base = base;
        this.main = main;
        this.visibility = visibility;
        this.wind = wind;
        this.clouds = clouds;
        this.dt = dt;
        this.sys = sys;
        this.timezone = timezone;
        this.id = id;
        this.name = name;
        this.cod = cod;
        this.weatherList = weatherList;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Integer getDt() {
        return dt;
    }

    public void setDt(Integer dt) {
        this.dt = dt;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public Integer getTimezone() {
        return timezone;
    }

    public void setTimezone(Integer timezone) {
        this.timezone = timezone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public List<WeatherList> getWeatherList() {
        return weatherList;
    }

    public void setWeatherList(List<WeatherList> weatherList) {
        this.weatherList = weatherList;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "coord=" + coord +
                ", base='" + base + '\'' +
                ", main=" + main +
                ", visibility=" + visibility +
                ", wind=" + wind +
                ", clouds=" + clouds +
                ", dt=" + dt +
                ", sys=" + sys +
                ", timezone=" + timezone +
                ", name='" + name + '\'' +
                ", cod=" + cod +
                ", weather_" + weatherList +
                ", datetime=" + dateTime +
                '}';
    }
}
