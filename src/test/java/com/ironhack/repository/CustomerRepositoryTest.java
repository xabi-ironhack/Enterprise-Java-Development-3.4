package com.ironhack.repository;


import com.ironhack.model.Customer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CustomerRepositoryTest {


    @Autowired
    private CustomerRepository customerRepository;

    @BeforeEach
    void setUp() {
        Customer customer = new Customer("Jose", "Green", 424242);
        customerRepository.save(customer);
    }

    @AfterEach
    void tearDown() {
        customerRepository.deleteAll();
    }

    @Test
    public void findAll_CustomerExist_CourseList(){
        List<Customer> customerList = customerRepository.findAll();
        assertEquals(1, customerList.size());
    }

    @Test
    public void test_FindCustomerById_CourseList(){
        Optional<Customer> customer = customerRepository.findById(1);
        assertTrue(customer.isPresent());
        assertEquals("Jose", customer.get().getName());
    }

    @Test
    public void test_FindCustomerByStatus_CourseList(){
        Optional<Customer> customer = customerRepository.findByStatus("Green");
        assertTrue(customer.isPresent());
        assertEquals("Green", customer.get().getStatus());
    }
}