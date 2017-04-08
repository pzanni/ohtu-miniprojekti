package ohtu.views;

import java.util.List;

import com.vaadin.navigator.View;

import ohtu.models.Reference;

public interface MainView extends View {

	interface MainViewListener {
		public void updateLists();
	}

	public void setReferences(List<Reference> refs);

	public void setListener(MainViewListener listener);
}
