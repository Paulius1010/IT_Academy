package com.swedbank.itacademy;

import java.util.*;

public class Library {
    private List<Book> booksList = new ArrayList<>();


    public List<Book> getAllBooks() {
        return booksList;
    }



    public int getNumberOfBooksInLibrary() {
        return booksList.size();
    }
//
//    public Book getBookByTitle(String title) throws NullPointerException {
//        return booksList.stream().filter(book -> book.getTitle().equals(title)).findFirst().orElseThrow();
//    }

    public Book getBookWithHighestPageCount() {
        if (booksList.isEmpty()) {
            throw new RuntimeException();
        }
        Book bookWithHighestPageCount = booksList.get(0);
        for (int i = 1; i < booksList.size(); i++) {
            Book book = booksList.get(i);
            if (book.getPages() > bookWithHighestPageCount.getPages()) {
                bookWithHighestPageCount = book;
            }
        }
        return bookWithHighestPageCount;
    }
    
    

}
