package ohtu.views;

import java.util.Map;

import ohtu.data.ReferenceDAO;
import ohtu.models.Reference;

public class AddPresenter implements AddView.AddViewListener {
	private AddView view;
	private ReferenceDAO dao;
	
	public AddPresenter(AddView view, ReferenceDAO dao) {
		this.view = view;
		this.dao = dao;
		
		view.setListener(this);
	}

	@Override
	public void saveReference(Map<String, String> input) {
		dao.addReference(new Reference(input));
	}
}
