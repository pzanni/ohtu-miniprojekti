package ohtu.views;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.Sizeable;
import com.vaadin.ui.Button;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

import ohtu.models.ArticleReferenceForm;
import ohtu.models.ReferenceForm;

@SuppressWarnings("serial")
public class AddView extends VerticalLayout implements View {

	public AddView(Navigator navigator) {
		setSizeFull();

		Button button = new Button("Go Back", e -> navigator.navigateTo(""));
		ReferenceForm form = new ReferenceForm();
                ArticleReferenceForm arForm = new ArticleReferenceForm();
                
		button.setStyleName(ValoTheme.BUTTON_PRIMARY);


		VerticalLayout main = new VerticalLayout(form, button);
                VerticalLayout articleAddLayout = new VerticalLayout(arForm);

                Panel panel = new Panel();
                panel.setHeight(80, Sizeable.UNITS_PERCENTAGE);
                articleAddLayout.setHeightUndefined();
                panel.setContent(articleAddLayout);
                
		addComponents(main);
                addComponents(panel);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
	}
}
