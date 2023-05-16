package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="Wishlist")
public class Wishlist 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wishid")
    private int wishid;
	@Column(name="uid")
	private int uid;
	@Column(name="bid")
	private int bid;
	@Column (name = "quantity")
	private int quantity;
	
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@ManyToOne(targetEntity =Books.class,fetch = FetchType.EAGER)
	@JoinColumn(name="bid",insertable = false,updatable = false)
	private Books w;
	
	@ManyToOne(targetEntity =Users.class,fetch = FetchType.EAGER)
	@JoinColumn(name="uid",insertable = false,updatable = false)
	private Users wi;
	
//	@ManyToOne(targetEntity =Department.class,fetch = FetchType.EAGER)
//	@JoinColumn(name="dept_id",insertable = false,updatable = false)
//	private Department department;
	
//	 @ManyToOne(mappedBy = "w");
//	 private Set<Users> users;
	
//	 @ManyToOne(mappedBy = "w");
//	 private Set<Users> users;
	
//	@ManyToOne(mappedBy = "bw");
//	private Set<Books> books;
	
	public Wishlist(int bid, int uid) {
		super();
		this.bid = bid;
		this.uid = uid;
	}

	public Wishlist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getWishid() {
		return wishid;
	}

	public void setWishid(int wishid) {
		this.wishid = wishid;
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
		return "Wishlist [wishid=" + wishid + ", uid=" + uid + ", bid=" + bid + ", quantity=" + quantity + "]";
	}

	
	
	
	
	

}
