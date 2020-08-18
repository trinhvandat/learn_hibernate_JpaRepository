package com.study.trinhvandat.hibernate.service;

import com.study.trinhvandat.hibernate.model.Book;

import java.util.List;

public interface BookService {

    Book addBook(Book added);

    int getAmountOfBook();

    List<Book> getBooksByMyId(int myId);

}
