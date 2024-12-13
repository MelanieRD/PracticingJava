package com.melanie.librarySystem.services;

import com.melanie.librarySystem.books.Book;

import java.util.ArrayList;
import java.util.List;

public class HistoryService implements IBookService {

    List<Book> historyBooks = new ArrayList<>();


    public int getSize(){
            return historyBooks.size();
    }

    public List<Book> getList(){
        return historyBooks;
    }

    @Override
    public void addBook(Book book) {
        if(book != null) {
            try{
                historyBooks.add(book);
                System.out.println("Book added");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }

    @Override
    public Book searchByName(String bookName) {

        Book bookFinded = null;

        for(Book book: historyBooks){
            if( (book.getName()).contains(bookName)){
                bookFinded = book;
                break;
            }
        }
        if(bookFinded != null){
            System.out.println("The book name is: "+ bookFinded.getName()+" Id: "+bookFinded.getId());
        } else System.out.println("Book was not finded, book value is null");

        return  bookFinded;
    }

    @Override
    public boolean DeleteById( int Id) {

        for(Book book: historyBooks){
            if(book.getId() == Id){
                historyBooks.remove(book);
                return true;
            }
        }

        return false;
    }

}
