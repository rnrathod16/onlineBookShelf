package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Books;
import com.example.demo.entity.Users;
import com.example.demo.persistance.BooksRepository;

@Service
public class Service_Implementation implements Service_Declarations{
	
	private BooksRepository br;
	@Autowired
	public Service_Implementation(BooksRepository br) {

		this.br=br;
	}

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
	@Transactional
	public void updateBook( Books b) {
		// TODO Auto-generated method stub
		br.save(b);
	}

	@Override
	public void deleteBookById(int bid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addStockToBooks(int q, int bid) 
	{
		// TODO Auto-generated method stub
		br.updateStocks(q, bid);
		
	}

	@Override
	public List<Books> searchByCategory(int cid) {
		// TODO Auto-generated method stub
		return br.findByCid(cid);
	}

	@Override
	public void addBookByCategory(Books book, int cid) {
		// TODO Auto-generated method stub
	}

	@Override
	@Transactional
	public List<Books> displayBooks() {
		// TODO Auto-generated method stub
		return br.findAll();
	}
	
	
}
