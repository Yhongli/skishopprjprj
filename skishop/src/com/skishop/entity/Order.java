package com.skishop.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	@Id
	private int id;
	private int productid;
	private String username;
	private String address;
	private double discountprice;
	private String productname;
	private int userid;
	private int count;
	private int admitsign;
	private int deletesign;
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getDiscountprice() {
		return discountprice;
	}
	public void setDiscountprice(double discountprice) {
		this.discountprice = discountprice;
	}
	public int getAdmitsign() {
		return admitsign;
	}
	public void setAdmitsign(int admitsign) {
		this.admitsign = admitsign;
	}
	public int getDeletesign() {
		return deletesign;
	}
	public void setDeletesign(int deletesign) {
		this.deletesign = deletesign;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
