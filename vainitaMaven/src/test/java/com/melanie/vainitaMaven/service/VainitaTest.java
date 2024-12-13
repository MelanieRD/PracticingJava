package com.melanie.vainitaMaven.service;

import com.melanie.vainitaMaven.person.Human;
import com.melanie.vainitaMaven.person.IPerson;
import com.melanie.vainitaMaven.person.Person;
import com.melanie.vainitaMaven.services.UserService;
import com.melanie.vainitaMaven.utils.List;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class VainitaTest {

    @Test
    public void InterfaceTest(){
        //Setup para comenzar el test
        UserService service = new UserService();
        //Donde se ejecuta la parte donde haremos la prueba

        Person Ismael = service.createPerson("Ismael", "Varela", "January 2, 1999");
        Human Ismael2 = Ismael;
        List<Human> persona = new List();
        persona.add(Ismael);
        persona.add(Ismael2);

        java.util.List<Human> persona2 = new ArrayList<>();
        persona2.add(Ismael);
        persona2.add(Ismael2);

        persona.size();
        persona2.size();

        persona.owner();


        // Aqui viene la prueba
        assertNotNull(Ismael);
        assertEquals("Ismael", Ismael.getName());
        assertEquals("Varela", Ismael.getLastName());
        assertEquals(25, Ismael.getAge());

    }
}
