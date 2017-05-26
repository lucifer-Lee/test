package com.lee.model;

public class book {
	private int id;
	private String name;
	private int num;
	
	
	
	public book(int id, String name, int num) {
		super();
		this.id = id;
		this.name = name;
		this.num = num;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getNum() {
		return num;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNum(int num) {
		this.num = num;
	}

	
}
