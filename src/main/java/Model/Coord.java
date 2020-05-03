
package Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
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


    @Override
    public String toString() {
        return "Coord{" +
                "lon=" + lon +
                ", lat=" + lat +
                ", weather=" + weather +
                '}';
    }
}
