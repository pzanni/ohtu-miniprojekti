package com.ohtu.models;

import com.ohtu.data.DAO;

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
        
        public void setTitle(String title) {
            this.title = title;
        }
        
        public void setAuthor(String author) {
            this.author = author;
        }
        
        public void setYear(int year) {
            this.year = year;
        }
	
	@Override
	public String toString() {
		return "";
	}
        
        public void save() {
            DAO dao = new DAO();
            dao.addReference(this);
        }
}
