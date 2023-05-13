package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Bookreview;
import com.example.demo.entity.Books;
import com.example.demo.entity.Orders;
import com.example.demo.entity.Users;
import com.example.demo.entity.Wishlist;
import com.example.demo.persistance.BookreviewsRepository;
import com.example.demo.persistance.BooksRepository;

import com.example.demo.persistance.WishlistRepository;

import com.example.demo.persistance.OrdersRepository;
import com.example.demo.persistance.UserRepository;


@Service
public class Service_Implementation implements Service_Declarations{
	
	
	private BooksRepository br;
	private WishlistRepository wl;
	private UserRepository ur;
	private OrdersRepository or;
	private BookreviewsRepository brw;
	@Autowired
	public Service_Implementation(BooksRepository br,UserRepository ur,OrdersRepository or,WishlistRepository wl,BookreviewsRepository brw) {

		this.br=br;
		this.ur=ur;
		this.or=or;
		this.wl=wl;
		this.brw=brw;
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
	@Transactional
	public void addBook(Books book) 
	{
		br.save(book);
		
	}
	@Override
	@Transactional
	public void addByCategories(Books book) 
	{
		br.save(book);
		
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
	@Transactional
	public void addStockToBooks(int q, int bid) 
	{
		// TODO Auto-generated method stub
		br.addStockToBook(q,bid);
		
	}

	@Override
	@Transactional
	public List<Books> searchByCategory(int cid) {
		// TODO Auto-generated method stub
		return br.findByCid(cid);
	}

	@Override
	@Transactional
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
	@Transactional
	public List<Wishlist> displayWishList() {
		// TODO Auto-generated method stub
		return wl.findAll();
	}
	
	
	@Override
	@Transactional
	public List<Users> displayUsers() {
		// TODO Auto-generated method stub
		return ur.findAll();
	}

	@Override
	@Transactional
	public List<Orders> historyOfOrders(int uid) {
		// TODO Auto-generated method stub
		return or.orderHistory(uid);
	}

	@Override
	@Transactional
	public List<Books> searchByName(String bname) {
		// TODO Auto-generated method stub
		return br.findByBname(bname);
	}

	@Override
	@Transactional
	public void addBookReview(Bookreview br2) {
		// TODO Auto-generated method stub
		br2.setReviewid(0);
		brw.save(br2);
	}

	@Override
	@Transactional
	public void updateBookReview(Bookreview br) {
		// TODO Auto-generated method stub
		brw.save(br);
	}

//	@Override
//	@Transactional
//	public void deleteBookReview(int id) {
//		// TODO Auto-generated method stub
//		brw.deleteById(id);
//	}

	@Override
	@Transactional
	public List<Bookreview> disaplayBookReviews() {
		// TODO Auto-generated method stub
		return brw.findAll();
	}
	
	


	
	
}
