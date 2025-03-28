

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Greet
 */
@WebServlet("/Greet")
public class Greet extends HttpServlet {
	
	public void service(HttpServlet req, HttpServletResponse res) {
		try {
			PrintWriter pw = res.getWriter();
			pw.println("<!DOCTYPE html>");
			pw.println("<html>");
			pw.println("<head><title>Sample</title>");
			pw.println("<body>");
			pw.println("<h1> HELLO WORLD...!<h1>");
			pw.println("</body");
			pw.print("/html>");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
