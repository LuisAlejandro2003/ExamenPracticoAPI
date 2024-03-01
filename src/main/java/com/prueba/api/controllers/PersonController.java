package com.prueba.api.controllers;


import com.prueba.api.models.Person;
import com.prueba.api.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        return personService.createPerson(person);
    }

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable String id) {
        return personService.getPersonById(id);
    }

    @GetMapping
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }
}
