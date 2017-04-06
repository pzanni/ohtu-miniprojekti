package ohtu.models;

import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class ReferenceForm extends VerticalLayout {
	private TextField author = new TextField("Author");
	private TextField title = new TextField("Title");
	private TextField year = new TextField("Year");
	private Button send = new Button("Add", e -> saveReference());
        
	public ReferenceForm() {
		addComponents(author, title, year, send);
	}

	private void saveReference() {
            Notification.show("Talletettu referenssi");
            Reference referenceToSave = new Reference(title.getValue(), author.getValue(), Integer.parseInt(year.getValue()));
            referenceToSave.save();
	}
}
