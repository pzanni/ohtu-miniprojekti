package ohtu.views;

import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.Sizeable;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

import ohtu.data.ReferenceDAO;
import ohtu.models.ReferenceForm;

@SuppressWarnings("serial")
public class AddViewImpl extends VerticalLayout implements AddView {
	private AddPresenter presenter;
	private Button previousButton;
	private ReferenceForm form;
	
	public AddViewImpl(ReferenceDAO dao) {
		setSizeFull();
		
		presenter = new AddPresenter(this, dao);

		previousButton = new Button("Go Back", e -> UI.getCurrent().getNavigator().navigateTo(""));
		previousButton.setStyleName(ValoTheme.BUTTON_PRIMARY);
		
		form = new ReferenceForm();
		
		setHeight(80, Sizeable.UNITS_PERCENTAGE);
		addComponents(form);
	}
	
	public void setListener(AddViewListener listener) {
		form.setListener(listener);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
	}
	
}
