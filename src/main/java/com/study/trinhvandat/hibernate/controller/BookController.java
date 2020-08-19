package com.study.trinhvandat.hibernate.controller;


import com.study.trinhvandat.hibernate.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BookController {

    private static final Logger LOG = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/amount_book", produces = "application/json")
    public ResponseEntity<?> gAmountBook(){
        return new ResponseEntity<>(bookService.getAmountOfBook(), HttpStatus.OK);
    }

    @GetMapping(value = "/get_book_by_myid", produces = "application/json")
    public ResponseEntity<?> getBooksByMyId(@RequestParam("myId") int myId){
        LOG.info("myid:{}", myId);
        LOG.info("infor:{}", bookService.getBooksByMyId(myId));
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping(value = "/get_book_page", produces = "application/json")
    public ResponseEntity<?> getBookPage(@RequestParam("userId") int userId, Pageable pageRequest){
        return new ResponseEntity<>(bookService.getBookByUserId(userId, pageRequest), HttpStatus.OK);
    }


}
