package com.example.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Wishlist;

public interface WishlistRepository extends JpaRepository<Wishlist, Integer> {

}
