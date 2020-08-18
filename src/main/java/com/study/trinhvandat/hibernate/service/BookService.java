package com.study.trinhvandat.hibernate.service;

import com.study.trinhvandat.hibernate.model.Book;

public interface BookService {

    Book addBook(Book added);

    int getAmountOfBook();

}
