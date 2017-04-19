package ohtu;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.junit.rules.ExternalResource;

import ohtu.app.Main;

public class ServerRule extends ExternalResource {
	private Server server;
	
	@Override
	protected void before() throws Throwable {
		server = new Server(8080);
		ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
		context.setContextPath("/");
		server.setHandler(context);
		
		context.addServlet(new ServletHolder(new Main.MyUIServlet()), "/*");
		
		try {
			server.start();
		} catch (Exception e) {}
	}

	@Override
	protected void after() {
		try {
			server.stop();
		} catch (Exception e) {}
	}
}
