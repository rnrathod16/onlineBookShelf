package com.example.demo.controller;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bookreview;
import com.example.demo.entity.Books;

import com.example.demo.entity.Wishlist;

import com.example.demo.entity.Orders;
import com.example.demo.entity.Users;

import com.example.demo.service.Service_Implementation;

@RestController
@RequestMapping("Books")
public class Shop_Controller {
	private Service_Implementation si;
	
	@Autowired
	public Shop_Controller(Service_Implementation si) {
		// TODO Auto-generated constructor stub
		this.si = si;
	}
	
	@GetMapping("list")
	public List<Books> findAll(){
		return si.displayBooks();
	}
	
	@PostMapping("list")
	public void insertBook(@RequestBody Books br )
	{
		br.setBid(0);
		si.addBook(br);
		
	}
	@PostMapping("list1")
	public void insertByCategories(@RequestBody Books br )
	{
		br.setBid(0);
		
		si.addBook(br);
	}

	
	@DeleteMapping("list/{deleteid}")
	public void deleteBook(@PathVariable("deleteid") int id) {
		si.deleteBookById(id);
	}
	
//	@PostMapping("wish")
//	public void addWishList(@RequestBody Wishlist wl) {
//		
//		si.addWishlistById(wl);		
//	}
	
	@GetMapping("wish")
	public List<Wishlist> findAllwish(){
		return si.displayWishList();
	}

	@GetMapping("list/users")
	public List<Users> findAllUsers(){
		return si.displayUsers();
	}
	
	@PostMapping("list/users")
	public void insert(@RequestBody Users user) {
		 si.register(user);
	}
	
	@PostMapping("login")
	public boolean login(@RequestBody Users user) {
		return si.login(user.getUemail(), user.getUpassword());
	}
	
	@GetMapping("list/users/orders/{uid}")
	public List<Orders> orderHis(@PathVariable("uid") int uid) {
		return si.historyOfOrders(uid);

	}
	
	@PutMapping("updateBook")
	public void updateBook(@RequestBody Books b)
	{
		si.updateBook(b);
	}
	
	@GetMapping("booksbycategories/{cat}")
	public List<Books> getByCategory(@PathVariable("cat") int cat){
		return si.searchByCategory(cat);

	}
	
	@PutMapping("updateStock")
	public void updateStock(@RequestBody Books b) {
		si.addStockToBooks(b.getBstock(), b.getBid());
	}
	
	@GetMapping("bookByName/{name}")
	public List<Books> getByName(@PathVariable("name")String name)
	{
		return si.searchByName(name);
	}
	
	@PostMapping("addReview")
	public void insertReview(@RequestBody Bookreview br) {
		 si.addBookReview(br);
	}
	
	@PutMapping("updateReview")
	public void updateReview(@RequestBody Bookreview br) {
		 si.updateBookReview(br);
	}
	
//	@DeleteMapping("deleteReview/{id}")
//	public void deleteReview(@PathVariable("id") int id) {
//		si.deleteBookReview(id);
//	}
	
	@GetMapping("reviews")
	public List<Bookreview> displayReviews(){
		return si.disaplayBookReviews();
	}

}
