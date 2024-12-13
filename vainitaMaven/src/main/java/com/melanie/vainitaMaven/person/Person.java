package com.melanie.vainitaMaven.person;

import java.util.Date;

public class Person extends Human implements IPerson{

    public Person(String name, String lastName, Date birth){
        this.name = name;
        this.lastName = lastName;
        this.birth = birth;
    }

    @Override  // Declarado en otro sitio pero difinido aqui, tambien podria estar en otro sitio, pero aqui lo redefino.
    public int getAge() {
        Date toDay = new Date();
        int age = - this.birth.getYear()+ toDay.getYear();
        return age;
    }

    public String getName(){
        return this.name;
    }

    public String getLastName(){
        return this.lastName;
    }
}
