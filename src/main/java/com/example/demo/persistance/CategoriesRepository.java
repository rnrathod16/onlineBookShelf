package com.example.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Integer> {

}
