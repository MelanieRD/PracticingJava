package com.melanie.librarySystem.books;

import java.util.Date;

public abstract class Book{

    protected int Id;
   protected String name;
   protected String autorB;
   protected Date creationDate;

   public Book(int Id, String name, String autor){
       this.Id = Id;
       this.name = name;
       this.autorB = autor;
       this.creationDate = new Date();
   }


    public String getName() {
        return name;
    }

    public int getId() {
        return Id;
    }

    public String getAutorB() {
        return autorB;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public abstract String getBookInfo();
}
