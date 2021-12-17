package com.handong.somoon.board;

public class BoardVO {
	/*
	 * sid int AUTO_INCREMENT, 
	 * userid varchar(20), 
	 * username varchar(40),
	 * password varchar(40), 
	 * email varchar(60), 
	 * blogurl varchar(100), 
	 * photo varchar(30),
	 * detail varchar(100), 
	 * regdate timestamp default CURRENT_TIMESTAMP, 
	 * primary key(sid)
	 * 
	 */
	private int sid;
	private String userid;
	private String username;
	private String name;
	private int star;
	private int average_star;
	private String address;
	private String category;
	private String url;
	private String menu;
	private String review;
	private String photo;
	private String regdate;
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
	public int getAverage_star() {
		return average_star;
	}
	public void setAverage_star(int average_star) {
		this.average_star = average_star;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

}
