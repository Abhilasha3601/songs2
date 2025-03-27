package com.example.book.model;

import javax.persistence.*;

@Entity
@Table(name = "library")
public class Book {
    @Id
    @Column(name = "bookid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "genre")
    private String genre;

    @Column(name = "availability")
    private boolean availability;

    public Book() {
    }

    public Book(int bookId, String title, String author, String genre, boolean availability) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availability = availability;
    }

    public int getBookId() {
        return bookid;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String Title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String Genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;

    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean getAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}