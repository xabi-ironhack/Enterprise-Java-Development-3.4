package com.ironhack.repository;


import com.ironhack.model.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AircraftRepository extends JpaRepository<Aircraft, String> {
    Optional<Aircraft> findAircraftByName(String name);
    Optional<Aircraft> findAircraftByNameContains(String word);
}
