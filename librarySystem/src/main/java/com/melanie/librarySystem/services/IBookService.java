package com.melanie.librarySystem.services;

import com.melanie.librarySystem.books.Book;

public interface IBookService {

    void addBook(Book book);
    Book searchByName( String bookName);
    boolean DeleteById(int Id);

}
