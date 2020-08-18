package com.study.trinhvandat.hibernate.controller;


import com.study.trinhvandat.hibernate.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/amount_book", produces = "application/json")
    public ResponseEntity<?> gAmountBook(){
        return new ResponseEntity<>(bookService.getAmountOfBook(), HttpStatus.OK);
    }
}
