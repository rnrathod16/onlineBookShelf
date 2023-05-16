package com.example.demo.controller;


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
import com.example.demo.entity.Categories;
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
	public void insertByCategories(@RequestBody Books br,int cid )
	{
		br.setBid(0);
		br.setCid(cid);
		si.addBook(br);
	}

	
//	@DeleteMapping("list/{deleteid}")
//	public void deleteBook(@PathVariable("deleteid") int id) {
//		si.deleteBookById(id);
//	}
	
	@PostMapping("wish")
	public void addWishList(@RequestBody Wishlist wl) {
		
		si.addToWishlist(wl);		
	}
	
	@GetMapping("wish")
	public List<Wishlist> findAllwish(){
		return si.displayWishList();
	}
	
	@DeleteMapping("wishlist/{deleteid}")
	public void deleteWishList(@PathVariable("deleteid") int id) {
		si.deleteWishListById(id);
	}

	@GetMapping("list/users")
	public List<Users> findAllUsers(){
		return si.displayUsers();
	}
	
	@PostMapping("list/users")
	public Users insert(@RequestBody Users user) {
		 return si.register(user);
	}
	
	@PostMapping("login")
	public Users login(@RequestBody Users user) {
		return si.login(user.getUemail(), user.getUpassword());
	}
	@PostMapping("getuser")
	public int searchByEmail(@RequestBody Users user) {
		return si.searchUserByEmail(user.getUemail());
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
	
	@GetMapping("getuserbyid/{id}")
	public Users getUserById(@PathVariable("id") int uid) {
		return si.getUserById(uid);
		
	}

	@GetMapping("getbookbyid/{id}")
	public Books getBookById(@PathVariable("id") int uid) {
		return si.getBookById(uid);
		
	}

	@PostMapping("insertCatogery")
	public void insertCatogery(@RequestBody Categories categories) {
		si.addCategory(categories);
	}
	
	@DeleteMapping("categories/{cid}")
	public void deleteCategory(@PathVariable("cid") int cid) {
		si.deleteCategory(cid);
	}
	
	@PostMapping("bookstatus")
	public List<Books> bookStatusFreePaid(@RequestBody Books book){
		return si.bookStatusFreePaid(book.getBstatus());
	}
	
	@GetMapping("list/categories")
	public List<Categories> getAllCategories(){
		return si.getAllCategories();
	}
	
	@GetMapping("searchBooks/{bdetail}")
	public List<Books> searchForBook(@PathVariable("bdetail") String bdetail)
	{
		return si.searchForBook(bdetail);
	}
	
	@PostMapping("deletebookbyid")
	public void deleteBookById(@RequestBody Books book) {
		System.out.println(book);
		si.deleteBookById(book.getBid());
	}
	
	@PostMapping("insertOrder")
	public void insertOrder(@RequestBody Orders o) {
		si.addOrder(o);
	}
	
	@GetMapping("allOrders")
	public List<Orders> getallOrders()
	{
		return si.getAllOrder();
	}

}
