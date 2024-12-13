package com.melanie.librarySystem.books;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.yaml.snakeyaml.nodes.Tag.STR;

public class History extends Book {

    private String country;
    private String century;

    //Constructor
    public History(int Id, String name,String autor, String country, String century ){

        //Vienen desde mi clase abstracta
        super(Id, name, autor);
        this.country = country;
        this.century = century;

    }

    @Override
    public String getBookInfo() {
        return this.Id+" title: "+ this.name+" autor: "+this.autorB+" date added: "+this.creationDate+" country: "+this.country+" century: "+ this.century;
    }


}
