package com.ironhack.repository;

import com.ironhack.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FlightRepository extends JpaRepository<Flight, String> {
    Optional<Flight> getByName(String name);
    Optional<Flight> getByMileageGreaterThan(Integer mileage);
}
