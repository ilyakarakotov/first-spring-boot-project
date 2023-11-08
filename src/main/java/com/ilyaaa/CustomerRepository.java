package com.ilyaaa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository
        extends JpaRepository<Customer, Integer> { // the JpaRepository allows all the cool CRUD operations! command + click to see the things JpaRepository does
}
