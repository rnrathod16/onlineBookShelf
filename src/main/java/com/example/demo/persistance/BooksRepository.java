package com.example.demo.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Books;

public interface BooksRepository extends JpaRepository<Books, Integer> 
{
	
	

	public List<Books> findByCid(int cid);

	

}
