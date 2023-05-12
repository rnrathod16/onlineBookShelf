package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Books;
import com.example.demo.entity.Orders;
import com.example.demo.entity.Users;
import com.example.demo.entity.Wishlist;
import com.example.demo.persistance.BooksRepository;

import com.example.demo.persistance.WishlistRepository;

import com.example.demo.persistance.OrdersRepository;
import com.example.demo.persistance.UserRepository;


@Service
public class Service_Implementation implements Service_Declarations{
	
	private BooksRepository br;

	private WishlistRepository wl;
	@Autowired
	public Service_Implementation(BooksRepository br,WishlistRepository wl) {

		this.br=br;
		this.wl=wl;
	}

	private UserRepository ur;
	private OrdersRepository or;
	@Autowired
	public Service_Implementation(BooksRepository br,UserRepository ur,OrdersRepository or) {

		this.br=br;
		this.ur=ur;
		this.or=or;

	}

	@Override
	@Transactional
	public boolean login(String uemail, String upassword) {
		// TODO Auto-generated method stub
		Users u = ur.checkLogin(uemail, upassword);
		if(u!=null) {
			return true;
		}
		return false;
	}

	@Override
	@Transactional
	public void register(Users user) {
		// TODO Auto-generated method stub
		ur.save(user);
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
	@Transactional
	public void deleteBookById(int bid) {
		// TODO Auto-generated method stub
		br.deleteById(bid);
		
	}

	@Override
	public void addStockToBooks(int bid) 
	{
		// TODO Auto-generated method stub
		
		
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
	
	

	public List<Users> displayUsers() {
		// TODO Auto-generated method stub
		return ur.findAll();
	}

	@Override
	public List<Orders> historyOfOrders(int uid) {
		// TODO Auto-generated method stub
		return or.orderHistory(uid);
	}


	
	
}
