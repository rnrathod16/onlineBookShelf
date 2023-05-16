package com.example.demo.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Wishlist;

public interface WishlistRepository extends JpaRepository<Wishlist, Integer> {

	@Modifying
	@Query(value = "delete from wishlist where bid= :wid", nativeQuery = true)
	void deleteByBookId(@Param("wid") int wid);

	@Query(value = "select * from wishlist where uid= :uid", nativeQuery = true)
	public List<Wishlist> getUsersCart(int uid);

	@Query(value = "select * from wishlist where uid= :uid and bid=:bid", nativeQuery = true)
	public Wishlist getWishByBookId(@Param("bid") int bid,@Param("uid") int uid);

	@Query(value = "delete from wishlist where uid= :uid and bid=:bid", nativeQuery = true)
	void deleteByBookIdAndUserId(@Param("bid") int bid,@Param("uid") int uid);

}
