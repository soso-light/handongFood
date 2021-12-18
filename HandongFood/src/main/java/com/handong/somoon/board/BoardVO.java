package com.handong.somoon.board;

public class BoardVO {
	/*
	 * sid int AUTO_INCREMENT, 
	 * Ranking int, 
	 * Address varchar(100), 
	 * Name varchar(100),
	 * Average float,
	 * Category varchar(100), 
	 * URL varchar(100), 
	 * Menu varchar(150),
	 * Photo longblob
	 * 
	 */
	
	private int sid;
	private String address;
	private String name;
	private float average;
	private String category;
	private String url;
	private String menu;
	private String photo;
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average = average;
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
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}


}

