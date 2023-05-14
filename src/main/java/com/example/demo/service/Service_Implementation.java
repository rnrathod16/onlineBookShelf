package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Bookreview;
import com.example.demo.entity.Books;
import com.example.demo.entity.Categories;
import com.example.demo.entity.Orders;
import com.example.demo.entity.Users;
import com.example.demo.entity.Wishlist;
import com.example.demo.persistance.BookreviewsRepository;
import com.example.demo.persistance.BooksRepository;
import com.example.demo.persistance.CategoriesRepository;
import com.example.demo.persistance.WishlistRepository;

import com.example.demo.persistance.OrdersRepository;
import com.example.demo.persistance.UserRepository;


@Service
public class Service_Implementation implements Service_Declarations{
	
	
	private BooksRepository br;
	private WishlistRepository wl;
	private CategoriesRepository cr;
	private UserRepository ur;
	private OrdersRepository or;
	private BookreviewsRepository brw;
	
	@Autowired
	Service_Implementation(BooksRepository br,UserRepository ur,OrdersRepository or,WishlistRepository wl,BookreviewsRepository brw,CategoriesRepository cr) {

		this.br=br;
		this.ur=ur;
		this.or=or;
		this.wl=wl;
		this.brw=brw;
		this.cr=cr;
	}

	@Override
	@Transactional
	public Users login(String uemail, String upassword) {
		// TODO Auto-generated method stub
		return ur.checkLogin(uemail, upassword);

	}

	@Override
	@Transactional
	public Users register(Users user) {
		// TODO Auto-generated method stub
		return ur.save(user);
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
	public void addStockToBooks(int q,int bid) 
	{
		// TODO Auto-generated method stub
		br.addStockToBook(q, bid);
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
	public void addToWishlist(Wishlist wishlist) {
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

	public void deleteWishListById(int wid) {
		// TODO Auto-generated method stub
		wl.deleteById(wid);
		
	}


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

	@Override
	public Users getUserById(int uid) {
		// TODO Auto-generated method stub
		return ur.findById(uid).get();
	}

	@Override
	public Books getBookById(int bid) {
		// TODO Auto-generated method stub
		return br.findById(bid).get();
	}
	
	@Override
	@Transactional
	public void addCategory(Categories categories) {
		cr.save(categories);
		
	}

	@Override
	@Transactional
	public int searchUserByEmail(String email) {
		// TODO Auto-generated method stub
		System.out.println(ur.searchByEmail(email));
		return ur.searchByEmail(email);
	}

	@Override
	@Transactional
	public List<Books> bookStatusFreePaid(String bstatus) {
		// TODO Auto-generated method stub
		return br.bookStatusFreePaid(bstatus);
	}

	@Override
	@Transactional
	public List<Categories> getAllCategories() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}
	
	@Override
	@Transactional
	public List<Books> searchForBook(String bdetail) {
		// TODO Auto-generated method stub
		return br.getBook(bdetail);
	}

	



	
	
}
