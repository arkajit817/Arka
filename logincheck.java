package Kumble;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/logincheck")
public class logincheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public logincheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		   
		    response.setContentType("text/html");
		    


		  String username = request.getParameter("username");
		    String password = request.getParameter("password");
		    
		    try {
		        Class.forName("com.mysql.jdbc.Driver");

		        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin","root","arka");  

		        String strQuery = "select * from users where username='"
		                + username + "' and password='" + password + "'";
		        System.out.println(password);
		        Statement st = conn.createStatement();
		        ResultSet rs = st.executeQuery(strQuery);
		        
		        if (rs.next()) {
		        	HttpSession session=request.getSession();
		        	session.setAttribute("username",username);
		           response.sendRedirect("Dashboard.jsp");
		           

		        } else {response.sendRedirect("Home.jsp");
		            
		        }
		        rs.close();
		        st.close();
		        
		    
		    }
		    
		        
		        catch (Exception e) {
		            e.printStackTrace();
		        }


		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
		  
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        	
	        	
	              
	}
}
	    



