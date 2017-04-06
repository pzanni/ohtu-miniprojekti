
package com.ohtu.models;

import com.ohtu.data.DAO;


public class ArticleReference extends Reference {
    
    String journal, note, key, volume;
    int number, pages, month;
    
    public ArticleReference(String title, String author, String journal, int year, String volume, int number, int pages, int month, String note, String key) {
        super(title, author, year);
        this.journal = journal;
        this.volume = volume;
        this.number = number;
        this.pages = pages;
        this.month = month;
        this.note = note;
        this.key = key;
    }

    public String getJournal() {
        return journal;
    }

    public String getNote() {
        return note;
    }

    public String getKey() {
        return key;
    }

    public String getVolume() {
        return volume;
    }

    public int getNumber() {
        return number;
    }

    public int getPages() {
        return pages;
    }

    public int getMonth() {
        return month;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    
    @Override
    public String toString() {
	return "";
    }
        
    public void save() {
        DAO dao = new DAO();
        dao.addArticleReference(this);
    }
}
