package com.example.spring.data.jpa.pagingsorting.controller;

import com.example.spring.data.jpa.pagingsorting.model.Book;
import com.example.spring.data.jpa.pagingsorting.model.Tutorial;
import com.example.spring.data.jpa.pagingsorting.repository.BookRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BookController {
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    BookRepository bookRepository;


    @GetMapping("/books")
    public ResponseEntity<Map<String, Object>> getBooks(
            @RequestParam(required = false) String title,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size,
            @RequestParam(defaultValue = "id,desc") String[] sort) {

        try {

            List<Book> tutorials = new ArrayList<>();
            Pageable pagingSort = PageRequest.of(page, size,Sort.by(new Sort.Order(
                    Sort.Direction.ASC,"id")));

            Page<Book> pageTuts;
                pageTuts = bookRepository.findAll(pagingSort);


            tutorials = pageTuts.getContent();

            Map<String, Object> response = new HashMap<>();
            response.put("tutorials", tutorials);
            response.put("currentPage", pageTuts.getNumber());
            response.put("totalItems", pageTuts.getTotalElements());
            response.put("totalPages", pageTuts.getTotalPages());

            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
