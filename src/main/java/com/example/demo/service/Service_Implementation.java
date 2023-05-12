package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Books;
import com.example.demo.entity.Users;

public class Service_Implementation implements Service_Declarations{

	@Override
	public boolean login(String uemail, String upassword) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void register(Users user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addBook(Books book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBook(Books book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBookById(int bid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addStockToBooks(int bid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Books> searchByCategory(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addBookByCategory(Books book, int cid) {
		// TODO Auto-generated method stub
		
	}
	
	
}
