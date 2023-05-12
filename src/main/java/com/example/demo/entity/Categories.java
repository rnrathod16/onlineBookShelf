package com.example.demo.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categories")
public class Categories {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cid")
	private int cid;
	@Column(name="cname")
	private String cname;
	
	@OneToMany(mappedBy = "categories")
	private Set<Books> books;

	public Categories(int cid, String cname, Set<Books> books) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.books = books;
	}

	public Categories() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Set<Books> getBooks() {
		return books;
	}

	public void setBooks(Set<Books> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Categories [cid=" + cid + ", cname=" + cname + ", books=" + books + "]";
	}
	
	
	
	

}
