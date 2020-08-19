package com.study.trinhvandat.hibernate.service;

import com.study.trinhvandat.hibernate.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookService {

    Book addBook(Book added);

    int getAmountOfBook();

    List<Book> getBooksByMyId(int myId);

    List<Book> getBookByUserId(int userId, Pageable pageRequest);

}
