package com.study.trinhvandat.hibernate.repository;

import com.study.trinhvandat.hibernate.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    @Query(value = "select book from book\n" +
            "inner join (select user.id as userid, my.id as myid from my inner join user on my.id = user.myid) as X\n" +
            "on book.userid = X.userid\n" +
            "where X.myid = ?1",
    nativeQuery = true)
    List<Book> findByMyId(int myId);

    List<Book> findByUserId(int userId, Pageable pageable);

}
