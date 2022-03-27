package com.example.firstspringproject.service;

import com.example.firstspringproject.model.api.CreatePersonRequest;
import com.example.firstspringproject.model.domain.Person;
import com.example.firstspringproject.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private final PersonRepository personRepository;

@Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> fetchPersons() {
        return personRepository.findAll();
    }

    public List<Person> fetchPersonByFirstNameAndLastName(String firstName, String lastName) {
        return personRepository.findAllByFirstNameAndLastName(firstName, lastName);
    }

    public Optional<Person> fetchPerson(Long id) {
        return personRepository.findById(id);
    }

    public Person createPerson(CreatePersonRequest request) {
Person person = Person.builder()
        .firstName(request.getFirstName())
        .middleName(request.getMiddleName())
        .lastName(request.getLastName())
                .email(request.getEmail())
                        .phone(request.getPhone()).build();
        return personRepository.save(person);
    }


    public void deletePerson(Long id) {
    personRepository.deleteById(id);
    }



}
