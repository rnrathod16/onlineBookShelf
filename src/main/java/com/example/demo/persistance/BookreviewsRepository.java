package com.example.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Bookreview;

public interface BookreviewsRepository extends JpaRepository<Bookreview, Integer> {

}
