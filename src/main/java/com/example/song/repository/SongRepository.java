package com.example.book.repository;

import com.example.book.model.Book;

import java.util.*;

public interface BookRepository {

    ArrayList<Book> gettAllBooks();

    Book getBookById(int bookId);

    Book addBook(book book);

    Book updateBook(int bookId, Book book);

    void deleteBook(int bookId);

    void shutdown();
}