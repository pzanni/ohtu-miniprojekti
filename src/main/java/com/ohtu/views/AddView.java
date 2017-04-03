package com.ohtu.views;

import com.ohtu.models.ReferenceForm;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@SuppressWarnings("serial")
public class AddView extends VerticalLayout implements View {

	public AddView(Navigator navigator) {
		setSizeFull();

		Button button = new Button("Go Back", e -> navigator.navigateTo(""));
		ReferenceForm form = new ReferenceForm();

		button.setStyleName(ValoTheme.BUTTON_PRIMARY);

		VerticalLayout main = new VerticalLayout(form, button);

		addComponents(main);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
	}
}
