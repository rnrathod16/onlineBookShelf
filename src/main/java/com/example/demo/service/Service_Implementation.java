package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Books;
import com.example.demo.entity.Users;
import com.example.demo.entity.Wishlist;
import com.example.demo.persistance.BooksRepository;
import com.example.demo.persistance.WishlistRepository;

@Service
public class Service_Implementation implements Service_Declarations{
	
	private BooksRepository br;
	private WishlistRepository wl;
	@Autowired
	public Service_Implementation(BooksRepository br,WishlistRepository wl) {

		this.br=br;
		this.wl=wl;
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
	public void updateBook(Books book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void deleteBookById(int bid) {
		// TODO Auto-generated method stub
		br.deleteById(bid);
		
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

	@Override
	@Transactional
	public List<Books> displayBooks() {
		// TODO Auto-generated method stub
		return br.findAll();
	}

	@Override
	@Transactional
	public void addWishlistById(Wishlist wishlist) {
		// TODO Auto-generated method stub
		wl.save(wishlist);		
	}

	@Override
	public List<Wishlist> displayWishList() {
		// TODO Auto-generated method stub
		return wl.findAll();
	}
	
	
	
	
}
