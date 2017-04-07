package ohtu.views;


import java.util.Map;
import com.vaadin.navigator.View;

public interface AddView extends View {
	
	interface AddViewListener {
		void saveReference(Map<String, String> input);
	}
	
	public void setListener(AddViewListener listener);
}
