package com.study.trinhvandat.hibernate.model;

import lombok.AllArgsConstructor;
import lombok.Builder;

import javax.persistence.*;
import java.util.Objects;

@Table(name = "book")
@Entity
@AllArgsConstructor
@Builder
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int bookId;

    @Column(name = "name")
    private String bookName;

    @Column(name = "author")
    private String authorOfBook;

    @Column(name = "year")
    private int yearOfBook;

    @Column(name = "amount")
    private int amountOfBook;

    @Column(name = "userid")
    private int userId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return bookId == book.bookId &&
                yearOfBook == book.yearOfBook &&
                amountOfBook == book.amountOfBook &&
                userId == book.userId &&
                Objects.equals(bookName, book.bookName) &&
                Objects.equals(authorOfBook, book.authorOfBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, bookName, authorOfBook, yearOfBook, amountOfBook, userId);
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Book() {
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorOfBook() {
        return authorOfBook;
    }

    public void setAuthorOfBook(String authorOfBook) {
        this.authorOfBook = authorOfBook;
    }

    public int getYearOfBook() {
        return yearOfBook;
    }

    public void setYearOfBook(int yearOfBook) {
        this.yearOfBook = yearOfBook;
    }

    public int getAmountOfBook() {
        return amountOfBook;
    }

    public void setAmountOfBook(int amountOfBook) {
        this.amountOfBook = amountOfBook;
    }

}
