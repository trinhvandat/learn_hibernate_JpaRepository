package com.study.trinhvandat.hibernate.service;

import com.study.trinhvandat.hibernate.model.Book;
import com.study.trinhvandat.hibernate.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceIml implements BookService{

    private static final Logger LOG = LoggerFactory.getLogger(BookServiceIml.class);

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
    @Transactional
    public List<Book> getBookByUserId(int userId, Pageable pageRequest) {
        return bookRepository.findByUserId(userId, pageRequest);
    }


    @Override
    @Transactional
    public List<Book> getBooksByMyId(int myId) {
        LOG.debug("myId:{}", myId);
        return bookRepository.findByMyId(myId);
    }
}
