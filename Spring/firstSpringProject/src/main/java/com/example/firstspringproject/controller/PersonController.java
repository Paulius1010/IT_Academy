package com.example.firstspringproject.controller;

import com.example.firstspringproject.model.api.CreatePersonRequest;
import com.example.firstspringproject.model.api.PersonResponse;
import com.example.firstspringproject.model.domain.Person;
import com.example.firstspringproject.service.PersonService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "api/v1/persons")
@Tag(name="Person Controller", description = "Experience service to fetch person data")
public class PersonController {
    private final PersonService personService;
@Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    @Operation(summary = "fetch person data from database")
    @ApiResponse(responseCode = "200",
            description = "A list of person object",
            content = @Content(schema = @Schema(implementation = PersonResponse.class)))
    public List<PersonResponse> fetchPersons() {
        List<Person> repositoryPersons = personService.fetchPersons();
        return repositoryPersons.stream().map(p -> new PersonResponse(p.getFirstName(), p.getLastName(), p.getEmail(), p.getPhone())).collect(Collectors.toList());
    }

    @GetMapping("/names")
    @Operation(summary = "fetch person data from database by first name and last name")
    @ApiResponse(responseCode = "200",
            description = "A list of person object",
            content = @Content(schema = @Schema(implementation = PersonResponse.class)))
    public List<PersonResponse> fetchPersonByFirstNameAndLastName(@RequestParam String firstName, @RequestParam String lastName) {
        List<Person> repositoryPersons = personService.fetchPersonByFirstNameAndLastName(firstName, lastName);
        return repositoryPersons.stream().map(p -> new PersonResponse(p.getFirstName(), p.getLastName(), p.getEmail(), p.getPhone())).collect(Collectors.toList());
    }

    @GetMapping(value= "/{id}")
    @Operation(summary = "fetch person data from database using id")
    @ApiResponse(responseCode = "200",
            description = "person object",
            content = @Content(schema = @Schema(implementation = PersonResponse.class)))
    public PersonResponse fetchPersonById(@PathVariable Long id) {
        Optional<Person> person = personService.fetchPerson(id);
        if (person.isEmpty()) {
throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Person not found with the requested id");
        } else
        return new PersonResponse(person.get().getFirstName(), person.get().getLastName(), person.get().getEmail(), person.get().getPhone());
    }

@PostMapping
    @Operation(summary = "Create new person in database")
    @ApiResponse(responseCode = "201",
            description = "New person successfully created in database",
            content = @Content(schema = @Schema(implementation = Long.class)))
public Long createPerson(@Validated @RequestBody CreatePersonRequest request) {
    return personService.createPerson(request).getId();
}

    @DeleteMapping (value= "/{id}")
    @Operation(summary = "delete person data from database using id")
        public ResponseEntity<Void> deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
        return ResponseEntity.noContent().build();
    }



}
