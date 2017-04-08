package ohtu.views;

import java.util.Map;

import ohtu.data.ReferenceDAO;
import ohtu.models.Reference;
import ohtu.views.AddView.AddViewListener;

public class AddPresenter implements AddViewListener {
	private AddView view;
	private ReferenceDAO dao;

	public AddPresenter(AddView view, ReferenceDAO dao) {
		this.view = view;
		this.dao = dao;

		view.setListener(this);
	}

	@Override
	public void saveReference(Map<String, String> input) {
		Reference ref = new Reference(input);
		if (ref.isValid()) {
			dao.addReference(ref);
			view.success();
		} else {
			view.failure();
		}
	}
}
