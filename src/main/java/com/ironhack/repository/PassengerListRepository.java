package com.ironhack.repository;


import com.ironhack.model.PassengerList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerListRepository extends JpaRepository<PassengerList, String> {
}
