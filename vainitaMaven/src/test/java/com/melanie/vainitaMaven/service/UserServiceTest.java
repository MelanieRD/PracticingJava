package com.melanie.vainitaMaven.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.melanie.vainitaMaven.person.Person;
import com.melanie.vainitaMaven.services.UserService;
import org.junit.jupiter.api.Test;
import java.util.Scanner;



public class UserServiceTest {

    @Test
    public void createValidPersonTest(){
        //Setup para comenzar el test
        UserService service = new UserService();
        //Donde se ejecuta la parte donde haremos la prueba

        Person Ismael = service.createPerson("Ismael", "Varela", "January 2, 1999");
        // Aqui viene la prueba
        assertNotNull(Ismael);
        assertEquals(25, Ismael.getAge());

// ALV

    }

}
