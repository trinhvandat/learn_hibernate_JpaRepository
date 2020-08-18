package com.study.trinhvandat.hibernate.service;

import com.study.trinhvandat.hibernate.model.Book;
import com.study.trinhvandat.hibernate.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceIml implements BookService{

    @Autowired
    private BookRepository bookRepository;


    @Override
    public Book addBook(Book added) {
        return bookRepository.save(added);
    }

    @Override
    public int getAmountOfBook() {
        return (int) bookRepository.count();
    }

    @Override
    public List<Book> getBooksByMyId(int myId) {
        return bookRepository.findBookByMyId(myId);
    }
}
