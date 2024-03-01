package com.prueba.api.services;



import com.prueba.api.models.Person;
import com.prueba.api.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    public Person getPersonById(String id) {
        return personRepository.findById(id).orElse(null);
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
}