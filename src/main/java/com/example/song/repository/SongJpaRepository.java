package com.example.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.book.model.Book;

@Repository
public interface BookJpaRepository extends BookRepository<Book, Integer> {

}
