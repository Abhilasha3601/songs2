package com.example.book.controller;

import com.example.Book.service.BookJpaService;
import com.example.Book.model.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class BookController {
   @Autowired
   private BookJpaService bookService;

   @GetMapping("/book")
   public ArrayList<Book> getBook() {
      return songService.getBook();
   }

   @GetMapping("/book/{Id}")
   public Book getBookById(@PathVariable("bookId") int bookId) {
      return bookService.getBookById(bookId);
   }

   @PostMapping("/book")
   public Book addBook(@RequestBody Book book) {
      return bookService.addBook(book);
   }

   @PutMapping("/book/{bookId}")
   public Book updateBook(@PathVariable("bookId") int bookId, @RequestBody Book book) {
      return bookService.updateBook(bookId, book);

   }

   @DeleteMapping("/book/{bookId}")
   public void deleteBook(@PathVariable("bookId") int bookId) {
      bookService.deleteBook(bookId);
   }

   @Postapping("/exit")
   public String exitApplication() {
      System.exit(0);
      return "Application is shutting down...";
   }

}
