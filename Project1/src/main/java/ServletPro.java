

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.naming.spi.DirStateFactory.Result;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPro
 */
@WebServlet("/ServletPro")
public class ServletPro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter p=response.getWriter();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
			String usr=request.getParameter("usrname");
			String pass=request.getParameter("password");
			PreparedStatement st=con.prepareStatement("select username from emp where username=? and password=?");
			st.setString(1, usr);
			st.setString(2, pass);
			ResultSet rs=st.executeQuery();
			if(rs.next()) {
				RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
				rd.forward(request, response);
			}
			else {
				RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
				rd.forward(request, response);
			//	p.println("<h1>Login failed</h1><br>");
				//p.println("<a href= pro.jsp>Try Again</a>");
				
			}
		}catch(Exception e) {
			PrintWriter pw=response.getWriter();
			pw.print(pw);
			System.out.println(e);
		}
	}

}
