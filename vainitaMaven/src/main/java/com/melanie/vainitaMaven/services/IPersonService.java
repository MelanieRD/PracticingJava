package com.melanie.vainitaMaven.services;

import com.melanie.vainitaMaven.person.Person;

import java.util.List;

public interface IPersonService {
    Person createPerson(String name, String lastName, String birth);

    List<Person> findByName(String name);

    List<Person> findByLastName(String lastName);


}
