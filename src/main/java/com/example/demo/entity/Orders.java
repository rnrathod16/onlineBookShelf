package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Orders")
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="oid")
	private int oid;
	@Column(name="oquantity")
	private int oquantity;
	@Column(name="oamount")
	private String oamount;
	@Column(name="oaddress")
	private String oaddress;
	@Column(name="uid")
	private int uid;
	@Column(name="bid")
	private int bid;
	
	
	public Orders() {

	}
	public Orders(int oid, int oquantity, String oamount, String oaddress, int uid, int bid) {

		this.oid = oid;
		this.oquantity = oquantity;
		this.oamount = oamount;
		this.oaddress = oaddress;
		this.uid = uid;
		this.bid = bid;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getOquantity() {
		return oquantity;
	}
	public void setOquantity(int oquantity) {
		this.oquantity = oquantity;
	}
	public String getOamount() {
		return oamount;
	}
	public void setOamount(String oamount) {
		this.oamount = oamount;
	}
	public String getOaddress() {
		return oaddress;
	}
	public void setOaddress(String oaddress) {
		this.oaddress = oaddress;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", oquantity=" + oquantity + ", oamount=" + oamount + ", oaddress=" + oaddress
				+ ", uid=" + uid + ", bid=" + bid + "]";
	}
	
	
}
