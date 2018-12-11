package model;

import java.util.Date;

public class profile {
	
	private String name;
	private int id;
	private Date dob;
	private String usrname;
	//creating a constructor for profile class
	
	public profile() {
	}
	//generating getters and setters for super class

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getUsrname() {
		return usrname;
	}

	public void setUsrname(String usrname) {
		this.usrname = usrname;
	}
	
	
}
