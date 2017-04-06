package ohtu.views;

import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;

import ohtu.data.DAO;
import ohtu.models.ArticleReference;
import ohtu.models.Reference;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class MainView extends VerticalLayout implements View {
    
	private ArrayList<Reference> refs;
        private ArrayList<ArticleReference> arRefs;
        private Grid<Reference> grid;
        private Grid<ArticleReference> grid2;
        private DAO dao;
        
	public MainView(Navigator navigator) {
            
                dao = new DAO();
                refs = dao.getAll();
		Button button = new Button("Add references", event -> navigator.navigateTo("addRefs"));
		grid = new Grid<>();
                grid2 = new Grid<>();
                
		HorizontalLayout main = new HorizontalLayout(grid, button);
                HorizontalLayout main2 = new HorizontalLayout(grid2);
		main.setSizeFull();
                main2.setSizeFull();
		grid.setSizeFull();
                grid2.setSizeFull();
		main.setExpandRatio(grid, 1);
                main2.setExpandRatio(grid2, 1);
                
                 updateLists();
                
		grid.addColumn(Reference::getTitle).setCaption("Title");
		grid.addColumn(Reference::getAuthor).setCaption("Author");
		grid.addColumn(Reference::getYear).setCaption("Year");
                
                grid2.addColumn(ArticleReference::getTitle).setCaption("Title");
		grid2.addColumn(ArticleReference::getAuthor).setCaption("Author");
		grid2.addColumn(ArticleReference::getYear).setCaption("Year");
                grid2.addColumn(ArticleReference::getJournal).setCaption("Journal");
		grid2.addColumn(ArticleReference::getNote).setCaption("Note");
		grid2.addColumn(ArticleReference::getMonth).setCaption("Month");
                grid2.addColumn(ArticleReference::getPages).setCaption("Pages");
                grid2.addColumn(ArticleReference::getNumber).setCaption("Number");

		addComponents(main);
                addComponents(main2);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
                updateLists();
	}
        
        public void updateLists() {
            
            refs = dao.getAll();
            grid.setItems(refs);
            
            arRefs = dao.getArticleReferences();
            grid2.setItems(arRefs);
        }
}
