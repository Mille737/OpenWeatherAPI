/*
package com.kea.weatherrestapi.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Clouds")
public class Clouds implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    private int all;

    @OneToOne(mappedBy = "clouds")
    private Weather weather;

    public int getAll() {
        return all;
    }

    public void setAll(int all) {
        this.all = all;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Clouds{" +
                "all=" + all +
                ", weather=" + weather +
                '}';
    }
}
*/