package com.ohtu.views;

import com.ohtu.data.DAO;
import com.ohtu.models.Reference;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class MainView extends VerticalLayout implements View {
    
	private ArrayList<Reference> refs;
        private Grid<Reference> grid;
        private DAO dao;
        
	public MainView(Navigator navigator) {
            
                dao = new DAO();
                refs = dao.getAll();
		Button button = new Button("Add references", event -> navigator.navigateTo("addRefs"));
		grid = new Grid<>();

		HorizontalLayout main = new HorizontalLayout(grid, button);
		main.setSizeFull();
		grid.setSizeFull();
		main.setExpandRatio(grid, 1);

                 updateList();
                
		grid.addColumn(Reference::getTitle).setCaption("Title");
		grid.addColumn(Reference::getAuthor).setCaption("Author");
		grid.addColumn(Reference::getYear).setCaption("Year");

		addComponents(main);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
                updateList();
	}
        
        public void updateList() {
            
            refs = dao.getAll();
            grid.setItems(refs);
        }
}
