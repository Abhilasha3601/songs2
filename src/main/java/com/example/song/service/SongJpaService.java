package com.example.book.service;

import com.example.book.model.Book;
import com.example.book.repository.BookJpaRepository;
import com.example.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.*;

@Service
public class BookJpaService implements BookRepository {

    @Autowired
    private BookJpaRepository bookJpaRepository;

    @Override
    public ArrayList<Book> getAllBook() {
        List<Book> bookList = bookJpaRepository.findAll();
        ArrayList<Book> books = new ArrayList<>(bookList);
        return books;
    }

    @Override
    public Book getBookById(int bookId) {
        try {
            Book book = bookJpaRepository.findById(bookId).get();
            return book;
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public Book addBook(Book book) {
        songJpaRepository.save(book);
        return book;
    }

    @Override
    public Book updateBook(int bookId, Book book) {
        try {
            Book newBook = BookJpaRepository.findById(bookId).get();

            if (book.getTitle() != null) {
                newBook.setTitle(book.getTitle());
            }
            if (book.getGenre() != null) {
                newBook.setGenre(book.getGenre());
            }
            if (book.getAuthor() != null) {
                newBook.setAuthor(book.getAuthor());
            }
            if (book.getAvailability() != null) {
                newBook.setAvailability(book.getAvailability());
            }
            bookJpaRepository.save(newBook);
            return newBook;
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public void deleteBook(int bookId) {
        try {
            bookJpaRepository.deleteById(bookId);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public void shutdown() {
        shutdownService.shutdownApplication();
    }
}
