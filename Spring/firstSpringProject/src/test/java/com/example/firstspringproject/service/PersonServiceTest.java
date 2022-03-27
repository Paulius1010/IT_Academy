package com.example.firstspringproject.service;

import com.example.firstspringproject.model.domain.Person;
import com.example.firstspringproject.repository.PersonRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.List;

import static org.mockito.Mockito.when;

public class PersonServiceTest {

    @Mock
    private PersonRepository repositoryMock;
    @InjectMocks
    private PersonService service;
    @Test
    public void When_FirstNamePresent_Expect_PersonsMatchingFirstname(){
        Person expected = Person.builder()
                .firstName("name")
                .lastName("surname")
                .build();
        when(repositoryMock.findAllByFirstNameAndLastName("name", "surname")).thenReturn(List.of(expected));

        List<Person> actual = service.fetchPersonByFirstNameAndLastName("name", "surname");
        Assertions.assertEquals(expected.getFirstName(), actual.get(0).getFirstName());
        Assertions.assertEquals(expected.getLastName(), actual.get(0).getLastName());
    }
}
