package com.example.demo.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Books;

public interface BooksRepository extends JpaRepository<Books, Integer> 
{
	
	

	public List<Books> findByCid(int cid);

	@Modifying
	@Query("update Books set bstock = (bstock + ?1) where bid = ?2")
	public void addStockToBook( int q,int bid);

	public List<Books> findByBname(String bname);


	

}
