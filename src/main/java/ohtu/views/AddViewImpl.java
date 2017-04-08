package ohtu.views;

import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.Sizeable;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@SuppressWarnings("serial")
public class AddViewImpl extends VerticalLayout implements AddView {
	private Button previousButton;
	private ReferenceForm form;
	
	public AddViewImpl() {
		setSizeUndefined();
		
		previousButton = new Button("Go Back", e -> UI.getCurrent().getNavigator().navigateTo(""));
		previousButton.setStyleName(ValoTheme.BUTTON_PRIMARY);
		previousButton.setHeightUndefined();
		form = new ReferenceForm();
		
		addComponents(previousButton, form);
	}
	
	public void setListener(AddViewListener listener) {
		form.setListener(listener);
	}

	@Override
	public void success() {
		Notification.show("Reference saved!");
		UI.getCurrent().getNavigator().navigateTo("");
		form.empty();
	}

	@Override
	public void failure() {
		Notification.show("Failed to save a reference");
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
	}
}
