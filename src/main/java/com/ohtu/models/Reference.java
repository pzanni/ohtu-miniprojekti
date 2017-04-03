package com.ohtu.models;

public class Reference {
	private String author, title;
	private int year;
	
	public Reference(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getYear() {
		return year;
	}
	
	@Override
	public String toString() {
		return "";
	}
}
