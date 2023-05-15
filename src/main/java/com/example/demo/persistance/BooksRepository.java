package com.example.demo.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Books;

public interface BooksRepository extends JpaRepository<Books, Integer> 
{
	
	String s1="update Books set bstock =(bstock+?1) where bid=?2";
	
	@Modifying
	@Query(s1)
	public void addStockToBook(int quantity,int bid);

	public List<Books> findByCid(int cid);


	public List<Books> findByBname(String bname);

	@Query("from Books where bstatus = ?1")
	public List<Books> bookStatusFreePaid(String bstatus);

	String s2="select * from books where bname=:bdetail  or bauthor=:bdetail or cid in (select cid from categories where cname=:bdetail);";
	@Query(value =s2, nativeQuery = true)
	public List<Books> getBook(@Param("bdetail") String bdetail);
	
	//String s2 =" from Books where bname like '%?1%'  or bauthor like '%?1%'";
	//@Query(s2)
	//public List<Books> getBook(String bdetail);
	


	

}
