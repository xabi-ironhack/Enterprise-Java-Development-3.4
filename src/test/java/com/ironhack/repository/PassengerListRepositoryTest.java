package com.ironhack.repository;


import com.ironhack.model.Aircraft;
import com.ironhack.model.Customer;
import com.ironhack.model.Flight;
import com.ironhack.model.PassengerList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PassengerListRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private AircraftRepository aircraftRepository;

    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private PassengerListRepository passengerListRepository;


    @BeforeEach
    void setUp() {
        Customer customer = new Customer("Juan", "Green", 424242);
        customerRepository.save(customer);
        Aircraft aircraft = new Aircraft("Boing 777", 42);
        aircraftRepository.save(aircraft);
        Flight flight = new Flight("az783", 903, 1);
        flightRepository.save(flight);
        PassengerList passengerList = new PassengerList( 1, 1);
        passengerListRepository.save(passengerList);
    }

    @AfterEach
    void tearDown() {
        flightRepository.deleteAll();
        aircraftRepository.deleteAll();
        customerRepository.deleteAll();
        passengerListRepository.deleteAll();
    }

    @Test
    public void test_passengerList_findAll() {
        List<PassengerList> passengerListList = passengerListRepository.findAll();
        assertEquals(1, passengerListList.size());
    }
}