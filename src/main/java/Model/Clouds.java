
package Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
@Entity
@Table(name = "clouds")
public class Clouds implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private Integer all;

    @OneToOne(mappedBy = "clouds")
    private Weather weather;

    public Integer getAll() {
        return all;
    }

    public void setAll(Integer all) {
        this.all = all;
    }


    @Override
    public String toString() {
        return "Clouds{" +
                "all=" + all +
                ", weather=" + weather +
                '}';
    }
}
