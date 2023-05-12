package com.example.demo.entity;

import javax.persistence.*;
import com.example.demo.entity.Users;
import com.example.demo.entity.*;

@Entity
@Table(name = "Bookreview")
public class Bookreview 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "reviewid")
	private int reviewid;
	
	@Column(name = "reviewdesc")
	private String reviewdesc;
	
	@Column(name = "bid")
	private int bid;
	
	@Column(name = "uid")
	private int uid;
	
	@ManyToOne(targetEntity = Books.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "bid", insertable = false, updatable = false)
	private Books br;
	
	@ManyToOne(targetEntity = Users.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "uid", insertable = false, updatable = false)
	private Users brev;
	
//	@ManyToOne(targetEntity = Users.class, fetch = FetchType.EAGER)
//	@JoinColumn(name = "uid", insertable = false, updatable = false)
//	private Users u;
	
	public Bookreview(int reviewid, String reviewdesc, int bid, int uid) {
		
		this.reviewid = reviewid;
		this.reviewdesc = reviewdesc;
		this.bid = bid;
		this.uid = uid;
	}

	public Bookreview() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bookreview [reviewid=" + reviewid + ", reviewdesc=" + reviewdesc + ", bid=" + bid + ", uid=" + uid
				+ "]";
	}

	public int getReviewid() {
		return reviewid;
	}

	public void setReviewid(int reviewid) {
		this.reviewid = reviewid;
	}

	public String getReviewdesc() {
		return reviewdesc;
	}

	public void setReviewdesc(String reviewdesc) {
		this.reviewdesc = reviewdesc;
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

	
	
	

}
