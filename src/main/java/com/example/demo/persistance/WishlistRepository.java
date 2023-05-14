package com.example.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Wishlist;

public interface WishlistRepository extends JpaRepository<Wishlist, Integer> {

	@Modifying
	@Query(value = "delete from wishlist where bid= :wid", nativeQuery = true)
	void deleteByBookId(@Param("wid") int wid);

}
