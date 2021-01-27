package com.ironhack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @Column(name = "customer_id")
    private Integer id;

    private String name;
    private String status;

    @Column(name = "total_mileage")
    private Integer totalMileage;


    public Customer() {
    }

    public Customer(String name, String status, Integer totalMileage) {
        this.name = name;
        this.status = status;
        this.totalMileage = totalMileage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer customerId) {
        this.id = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String customerName) {
        this.name = customerName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String customerStatus) {
        this.status = customerStatus;
    }

    public Integer getTotalMileage() {
        return totalMileage;
    }

    public void setTotalMileage(Integer customerTotalMileage) {
        this.totalMileage = customerTotalMileage;
    }
}


