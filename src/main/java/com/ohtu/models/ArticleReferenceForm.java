
package com.ohtu.models;

import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class ArticleReferenceForm extends VerticalLayout {
    
    private TextField title = new TextField("Title");
    private TextField author = new TextField("Author");
    private TextField journal = new TextField("Journal");
    private TextField year = new TextField("Year");
    private TextField volume = new TextField("Volume");
    private TextField number = new TextField("Number");
    private TextField pages = new TextField("Pages");
    private TextField month = new TextField("Month");
    private TextField note = new TextField("note");
    private TextField key = new TextField("key");
    private Button send = new Button("Add", e -> saveArticleReference());
        
    public ArticleReferenceForm() {
	addComponents(title, author, journal, year, volume, number, pages, month, note, key, send);
    }

    private void saveArticleReference() {
        Notification.show("Talletettu referenssi");
        ArticleReference referenceToSave = new ArticleReference(    title.getValue(), 
                                                                    author.getValue(), 
                                                                    journal.getValue(), 
                                                                    Integer.parseInt(year.getValue()),
                                                                    volume.getValue(),        
                                                                    Integer.parseInt(number.getValue()),        
                                                                    Integer.parseInt(pages.getValue()),        
                                                                    Integer.parseInt(month.getValue()),        
                                                                    note.getValue(),        
                                                                    key.getValue()        
                                                                );
        referenceToSave.save();
    }
}
