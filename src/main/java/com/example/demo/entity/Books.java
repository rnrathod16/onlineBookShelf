package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Books")
public class Books {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="bid")
	private int bid;
	@Column(name="bname")
	private String bname;
	@Column(name="bdesc")
	private String bdesc;
	@Column(name="bprice")
	private String bprice;
	@Column(name="bauthor")
	private String bauthor;
	@Column(name="bpublishdate")
	private String bpublishdate;
	@Column(name="bimg")
	private String bimg;
	@Column(name="bstock")
	private int bstock;
	@Column(name="bstatus")
	private String bstatus;
	@Column(name="cid")
	private int cid;
	
	public Books() {
		
	}

	public Books(int bid, String bname, String bdesc, String bprice, String bauthor, String bpublishdate, String bimg,
			int bstock, String bstatus, int cid) {
		this.bid = bid;
		this.bname = bname;
		this.bdesc = bdesc;
		this.bprice = bprice;
		this.bauthor = bauthor;
		this.bpublishdate = bpublishdate;
		this.bimg = bimg;
		this.bstock = bstock;
		this.bstatus = bstatus;
		this.cid = cid;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBdesc() {
		return bdesc;
	}

	public void setBdesc(String bdesc) {
		this.bdesc = bdesc;
	}

	public String getBprice() {
		return bprice;
	}

	public void setBprice(String bprice) {
		this.bprice = bprice;
	}

	public String getBauthor() {
		return bauthor;
	}

	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}

	public String getBpublishdate() {
		return bpublishdate;
	}

	public void setBpublishdate(String bpublishdate) {
		this.bpublishdate = bpublishdate;
	}

	public String getBimg() {
		return bimg;
	}

	public void setBimg(String bimg) {
		this.bimg = bimg;
	}

	public int getBstock() {
		return bstock;
	}

	public void setBstock(int bstock) {
		this.bstock = bstock;
	}

	public String getBstatus() {
		return bstatus;
	}

	public void setBstatus(String bstatus) {
		this.bstatus = bstatus;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "Books [bid=" + bid + ", bname=" + bname + ", bdesc=" + bdesc + ", bprice=" + bprice + ", bauthor="
				+ bauthor + ", bpublishdate=" + bpublishdate + ", bimg=" + bimg + ", bstock=" + bstock + ", bstatus="
				+ bstatus + ", cid=" + cid + "]";
	}
	
	
	
	
}
