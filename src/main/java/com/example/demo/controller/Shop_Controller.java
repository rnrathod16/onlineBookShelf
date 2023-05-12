package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Books;
import com.example.demo.entity.Wishlist;
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
}
