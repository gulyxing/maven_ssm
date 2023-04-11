package com.guly.pojo;

public class User {
	
	private Integer id;
	private String uname;
	private Integer uage;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Integer getUage() {
		return uage;
	}
	public void setUage(Integer uage) {
		this.uage = uage;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", uage=" + uage + "]";
	}
	


}
