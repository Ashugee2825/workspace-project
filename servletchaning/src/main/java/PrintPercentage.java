

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/PrintPercentage")
public class PrintPercentage extends HttpServlet  {
protected void service (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	try {
		PrintWriter pw = res.getWriter();
		HttpSession hs = req.getSession();
		int m1 = (int) hs.getAttribute("marks1");
		int m2 = (int) hs.getAttribute("marks2");
		int m3 = (int) hs.getAttribute("marks3");
		
		float percentage =((float)(m1+ m2+ m3) /300) * 100;
		pw.println(percentage);
	}
	catch (Exception e) {
		e.printStackTrace();
		}
}
}