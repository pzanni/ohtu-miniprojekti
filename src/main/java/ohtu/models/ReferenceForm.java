
package ohtu.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import ohtu.views.AddView;

@SuppressWarnings("serial")
public class ReferenceForm extends VerticalLayout {

	//"Number"("Pages");("Month");"note");"key");
	private List<TextField> fields;
	private List<String> fieldNames = Arrays.asList("Title", "Author", "Journal", "Year", "Volume");
	private Button send = new Button("Add", e -> saveReference());
	private AddView.AddViewListener listener;

	public ReferenceForm() {
		fields = new ArrayList<>();
		fieldNames.forEach(s -> fields.add(new TextField(s)));
		fields.forEach(f -> addComponent(f));
		addComponent(send);
	}

	private void saveReference() {
		if (listener == null) return;
		
		Notification.show("Talletettu referenssi");
		
		Map<String, String> input = new HashMap<>();
		
		fields.forEach(f -> {
			input.put(f.getCaption(), f.getValue());
		});

		listener.saveReference(input);
	}
	
	public void setListener(AddView.AddViewListener listener) {
		this.listener = listener;
	}

}
