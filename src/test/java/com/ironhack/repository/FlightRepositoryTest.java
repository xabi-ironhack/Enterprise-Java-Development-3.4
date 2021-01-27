package com.ironhack.repository;


import com.ironhack.model.Aircraft;
import com.ironhack.model.Flight;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class FlightRepositoryTest {

    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private AircraftRepository aircraftRepository;

    @BeforeEach
    void setUp() {
        Aircraft aircraft = new Aircraft("Boing 777", 42);
        aircraftRepository.save(aircraft);
        Flight flight = new Flight("az783", 903, 1);
        flightRepository.save(flight);
    }

    @AfterEach
    void tearDown() {
        flightRepository.deleteAll();
        aircraftRepository.deleteAll();
    }

    @Test
    public void test_flightRepository_getAll(){
        List<Flight> flightList = flightRepository.findAll();
        assertEquals(1, flightList.size());
    }

    @Test
    public void test_flightByName_getOne(){
        Optional<Flight> flight = flightRepository.getByName("az783");
        assertTrue(flight.isPresent());
        assertEquals("az783", flight.get().getName());
    }

    @Test
    public void test_flightByMileageGreaterThen_getOne(){
        Optional<Flight> flight = flightRepository.getByMileageGreaterThan(500);
        assertTrue(flight.isPresent());
        assertEquals(903, flight.get().getMileage());
    }
}