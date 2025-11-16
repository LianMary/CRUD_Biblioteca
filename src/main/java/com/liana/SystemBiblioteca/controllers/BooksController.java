package com.liana.SystemBiblioteca.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import com.liana.SystemBiblioteca.repositories.BookRepository;

@RestController
@RequestMapping("/books")

public class BooksController{
    @Autowired
    private BookRepository repository;
    @GetMapping
    public ResponseEntity getAllBooks(){
        var allBooks = repository.findAll();
        return ResponseEntity.ok(allBooks);
    }
}