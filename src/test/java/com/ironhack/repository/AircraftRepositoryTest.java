package com.ironhack.repository;

import com.ironhack.model.Aircraft;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class AircraftRepositoryTest {

    @Autowired
    private AircraftRepository aircraftRepository;

    @BeforeEach
    void setUp() {
        Aircraft aircraft = new Aircraft("Boeing 777", 42);
        aircraftRepository.save(aircraft);
    }

    @AfterEach
    void tearDown() {
        aircraftRepository.deleteAll();
    }

    @Test
    public void test_AircraftExist_CourseList(){
        List<Aircraft> aircraftList = aircraftRepository.findAll();
        assertEquals(1, aircraftList.size());
    }

    @Test
    public void test_FindByName_Aircraft(){
        Optional<Aircraft> aircraft = aircraftRepository.findAircraftByName("Boeing 777");
        assertTrue(aircraft.isPresent());
        assertEquals("Boeing 777",aircraft.get().getName() );
    }

    @Test
    public void test_FindIfContain_Aircraft(){
        Optional<Aircraft> aircraft = aircraftRepository.findAircraftByNameContains("Boeing");
        assertTrue(aircraft.isPresent());
        assertEquals("Boeing 777",aircraft.get().getName() );
    }
}
