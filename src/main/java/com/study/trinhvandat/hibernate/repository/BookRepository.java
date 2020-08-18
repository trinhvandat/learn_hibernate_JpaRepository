package com.study.trinhvandat.hibernate.repository;

import com.study.trinhvandat.hibernate.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
