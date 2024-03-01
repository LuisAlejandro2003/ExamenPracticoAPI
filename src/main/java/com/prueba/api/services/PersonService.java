package com.prueba.api.services;

import com.prueba.api.models.Person;
import java.util.List;

public interface PersonService {
    Person createPerson(Person person);
    Person getPersonById(String id);
    List<Person> getAllPersons();
}