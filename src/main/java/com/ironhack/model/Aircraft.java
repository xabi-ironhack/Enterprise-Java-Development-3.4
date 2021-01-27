package com.ironhack.model;

import javax.persistence.*;

@Entity
@Table(name = "aircrafts")
public class Aircraft {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer seats;

    public Aircraft() {
    }

    public Aircraft(String name, Integer seats) {
        this.name = name;
        this.seats = seats;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer aircraftId) {
        this.id = aircraftId;
    }

    public String getName() {
        return name;
    }

    public void setName(String aircraftName) {
        this.name = aircraftName;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer aircraftSeats) {
        this.seats = aircraftSeats;
    }
}
