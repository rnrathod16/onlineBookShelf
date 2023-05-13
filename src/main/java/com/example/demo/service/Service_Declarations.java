package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Bookreview;
import com.example.demo.entity.Books;
import com.example.demo.entity.Categories;
import com.example.demo.entity.Orders;
import com.example.demo.entity.Users;
import com.example.demo.entity.Wishlist;

public interface Service_Declarations {
	
	public Users login(String uemail, String upassword);
	public void register(Users user);
	
	//Admin
	public List<Books> displayBooks();
	public void addBook(Books book);
	public void updateBook(Books book);
	public void addByCategories(Books book);
	public List<Books> searchByName(String bname);

	public void addCategory(Categories categories);
	public void deleteBookById(int bid);

	public void addStockToBooks(int q,int bid);

	
	public List<Books> searchByCategory(int cid);
	public void addBookByCategory(Books book, int cid);
	
	public void addBookReview(Bookreview br2);
	public void updateBookReview(Bookreview br);
	//public void deleteBookReview(int id);
	public List<Bookreview> disaplayBookReviews();
	

	public void addToWishlist(Wishlist wishlist);

	//Users
	public List<Users> displayUsers();
	public List<Orders> historyOfOrders(int uid); 

//	public List<Books> searchBook(String general);
	public List<Wishlist> displayWishList();
	public void deleteWishListById(int wid);
	
}
