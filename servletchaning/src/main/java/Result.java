

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Result
 */
@WebServlet("/Result")
public class Result extends HttpServlet {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3360/august?user=root&password=1234";
	String sql = "select * from result where id=?";
	public void init() {
		try {
			Class.forName(driver);
			System.out.println("Driver Loaded");
			con = DriverManager.getConnection(url);
			System.out.println("Connection Extablished");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
@Override
public void service (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
try {
	PrintWriter pw = res.getWriter();
	pstmt = con.prepareStatement(sql);
	String rollno = req.getParameter("rollno");
	int id = Integer.parseInt(rollno);
	pstmt.setInt(1, id);
	rs = pstmt.executeQuery(); 
	if(rs.next()) {
		String name = rs.getString(2);
		int m1 = rs.getInt(4);
		int m2 = rs.getInt(5);
		int m3 = rs.getInt(6);
		HttpSession session = req.getSession(true);
		session.setAttribute("marks1", m1);
		session.setAttribute("marks2", m2);
		session.setAttribute("marks3", m3);

		pw.println(name);
		pw.println(m1);
		pw.println(m2);
		pw.println(m3);
		
// Dispatch req to printpercentage servlet 
	//	ServletContext sc = req.getServletContext();
	//	 RequestDispatcher rd = sc.getRequestDispatcher("/servletchanining/printPercentage");
	//	rd.forward(req,res);
		
		req.getServletContext().getRequestDispatcher("/printPercentage").include(req, res);

	}
	else {
		res.sendRedirect("/servletchaning/error.html");
	}
}

catch (Exception e) {
	e.printStackTrace();
}
}

public void destroy() {
	try {
		con.close();
		pstmt.close();
		rs.close();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
}
}
