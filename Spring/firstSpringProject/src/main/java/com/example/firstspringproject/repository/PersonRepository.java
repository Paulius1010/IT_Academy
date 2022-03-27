package com.example.firstspringproject.repository;

import com.example.firstspringproject.model.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findAllByFirstNameAndLastName(String firstName, String lastName);
}


