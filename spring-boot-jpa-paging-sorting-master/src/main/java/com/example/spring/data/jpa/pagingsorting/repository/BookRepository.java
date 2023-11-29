package com.example.spring.data.jpa.pagingsorting.repository;

import com.example.spring.data.jpa.pagingsorting.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
