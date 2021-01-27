package com.ironhack.model;

import javax.persistence.*;

@Entity
@Table (name="passenger_list")
public class PassengerList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "flight_id")
    private Integer flightId;

    public PassengerList() {
    }

    public PassengerList(Integer customerId, Integer flightId) {
        this.customerId = customerId;
        this.flightId = flightId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }
}



