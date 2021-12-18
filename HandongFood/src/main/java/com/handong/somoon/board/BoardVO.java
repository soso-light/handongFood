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
	private int Ranking;
	private String Address;
	private String Name;
	private float Average;
	private String Category;
	private String URL;
	private String Menu;
	private String Photo;

	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getRanking() {
		return Ranking;
	}
	public void setRanking(int ranking) {
		Ranking = ranking;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getAverage() {
		return Average;
	}
	public void setAverage(float average) {
		Average = average;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public String getMenu() {
		return Menu;
	}
	public void setMenu(String menu) {
		Menu = menu;
	}
	public String getPhoto() {
		return Photo;
	}
	public void setPhoto(String photo) {
		Photo = photo;
	}

}
