package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="wishlist")
public class Wishlist 
{
	
	@Column(name="bid")
	private int bid;
	@Column(name="bid")
	private int uid;
	
	
	
	
	public Wishlist(int bid, int uid) {
		super();
		this.bid = bid;
		this.uid = uid;
	}

	public Wishlist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "Wishlist [bid=" + bid + ", uid=" + uid + "]";
	}
	
	
	
	

}
