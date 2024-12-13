package com.melanie.vainitaMaven.services;

import com.melanie.vainitaMaven.person.Person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Date;
import java.util.Locale;

public class UserService implements IPersonService {


    @Override
    public Person createPerson(String name, String lastName, String birth) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(birth, formatter);
        Date birthValue = new Date(date.toEpochDay());

       Person newPerson = new Person(name, lastName, birthValue);
       return newPerson;
    }

    @Override
    public List<Person> findByName(String name) {
        return List.of();
    }

    @Override
    public List<Person> findByLastName(String lastName) {
        return List.of();
    }

}
