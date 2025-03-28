

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Greet
 */
@WebServlet("/Greet")
public class Greet1 extends HttpServlet {
	
	public void service(HttpServlet req, HttpServletResponse res) {
		try {
			res.sendRedirect("/Greet/NewFile.html");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
