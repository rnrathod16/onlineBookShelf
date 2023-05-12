package com.example.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Books;

public interface BooksRepository extends JpaRepository<Books, Integer> {

}
