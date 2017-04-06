package ohtu.app;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;

import ohtu.data.FakeDatabase;
import ohtu.views.AddView;
import ohtu.views.MainView;

@SuppressWarnings("serial")
@Theme("mytheme")
public class Main extends UI {

	@Override
	protected void init(VaadinRequest vaadinRequest) {

            FakeDatabase fd = new FakeDatabase();
            
            getPage().setTitle("Main page - Title");

		Navigator navigator = new Navigator(this, this);
		navigator.addView("", new MainView(navigator));
		navigator.addView("addRefs", new AddView(navigator));
	}

	
	@WebServlet(urlPatterns = "/*", asyncSupported = true)
	@VaadinServletConfiguration(ui = Main.class, productionMode = false)
	public static class MyUIServlet extends VaadinServlet {
	}
	
}