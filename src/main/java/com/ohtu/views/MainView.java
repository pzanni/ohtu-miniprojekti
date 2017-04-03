package com.ohtu.views;

import java.util.Arrays;
import java.util.List;

import com.ohtu.models.Reference;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class MainView extends VerticalLayout implements View {
	private List<Reference> refs = Arrays.asList(new Reference("title1", "author", 1986),
			new Reference("title2", "author4", 1999));

	public MainView(Navigator navigator) {
		Button button = new Button("Add references", event -> navigator.navigateTo("addRefs"));
		Grid<Reference> grid = new Grid<>();

		HorizontalLayout main = new HorizontalLayout(grid, button);
		main.setSizeFull();
		grid.setSizeFull();
		main.setExpandRatio(grid, 1);

		grid.setItems(refs);
		grid.addColumn(Reference::getTitle).setCaption("Title");
		grid.addColumn(Reference::getAuthor).setCaption("Author");
		grid.addColumn(Reference::getYear).setCaption("Year");

		addComponents(main);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub

	}
}
