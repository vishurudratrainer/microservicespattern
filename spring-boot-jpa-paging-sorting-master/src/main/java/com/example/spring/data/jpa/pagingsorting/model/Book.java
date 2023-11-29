package com.example.spring.data.jpa.pagingsorting.model;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    String bookName;

    String author;
}
