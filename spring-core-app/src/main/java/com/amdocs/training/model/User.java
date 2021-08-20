package com.amdocs.training.model;

import java.sql.Date;

public class User {
	private int userId;
	private String name;
	private String email;
	private String address;
	private long phone;
	private String password;
	private String upload_photo;
	private Date reg_date;
	private Course course;
	
	public User() {}
	
	public User(String name, String email, String address, long phone) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}

	public User(int userId, String name, String email, long phone, String password, String upload_photo,
			Date reg_date) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.upload_photo = upload_photo;
		this.reg_date = reg_date;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUpload_photo() {
		return upload_photo;
	}
	public void setUpload_photo(String upload_photo) {
		this.upload_photo = upload_photo;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", address=" + address + ", phone="
				+ phone + ", password=" + password + ", upload_photo=" + upload_photo + ", reg_date=" + reg_date
				+ ", course=" + course + "]";
	}
	
	
	
}
