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
@Table(name="Categories")
public class Categories {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cid")
	private int cid;
	@Column(name="cname")
	private String cname;
	
	@OneToMany(mappedBy = "bc")
	private Set<Books> Cbooks;

	public Categories(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
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


	@Override
	public String toString() {
		return "Categories [cid=" + cid + ", cname=" + cname + ", books=" ;
	}
	
	
	

}
