package com.mando.crudmango.model;


import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;




@Document(collection="studentdb")
public class Customer{
	@Id
	private String  cid;
	private String cname;
	private String fname;
	private String lname;
	private String location;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", fname=" + fname + ", lname=" + lname + ", location="
				+ location + "]";
	
}}
 