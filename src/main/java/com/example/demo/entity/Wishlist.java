package com.example.demo.entity;

import java.util.Set;

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
