package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Books;
import com.example.demo.entity.Users;

public interface Service_Declarations {
	
	public boolean login(String uemail, String upassword);
	public void register(Users user);
	
	//Admin
	public List<Books> displayBooks();
	public void addBook(Books book);
	public void updateBook(Books book);
	
	public void deleteBookById(int bid);
	public void addStockToBooks(int q, int bid);
	
	public List<Books> searchByCategory(int cid);
	public void addBookByCategory(Books book, int cid);
	
	//Users
	
//	public List<Books> searchBook(String general);
	
	
}
