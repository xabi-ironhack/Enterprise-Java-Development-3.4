package com.ironhack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flights")
public class Flight {
    @Id
    @Column(name = "flight_id")
    private Integer id;

    private String name;
    private Integer mileage;

    @Column(name = "aircraft_id")
    private Integer aircraftId;

    public Flight() {
    }

    public Flight(String name, Integer mileage, Integer aircraftId) {
        this.name = name;
        this.mileage = mileage;
        this.aircraftId = aircraftId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer flightId) {
        this.id = flightId;
    }

    public String getName() {
        return name;
    }

    public void setName(String flightName) {
        this.name = flightName;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer flightMileage) {
        this.mileage = flightMileage;
    }

    public Integer getAircraftId() {
        return aircraftId;
    }

    public void setAircraftId(Integer aircraftId) {
        this.aircraftId = aircraftId;
    }
}
