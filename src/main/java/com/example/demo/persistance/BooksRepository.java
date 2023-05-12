package com.example.demo.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Books;

public interface BooksRepository extends JpaRepository<Books, Integer> 
{
	
	String s1="update Books set bstock =(bstock+?1) where bid=?2";
	
	@Modifying
	@Query(s1)
	public void addStockToBook(int quantity,int bid);

	public List<Books> findByCid(int cid);

	

}
