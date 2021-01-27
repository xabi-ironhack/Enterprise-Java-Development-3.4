package com.ironhack.repository;

import com.ironhack.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
    Optional<Customer> findById(Integer id);
    Optional<Customer> findByStatus(String status);
}
