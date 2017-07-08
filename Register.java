package Kumble;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class yuvi
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("arka");
   	  response.setContentType("text/html;charset=UTF-8");
   	  response.setContentType("text/html"); 
   	  PrintWriter out = response.getWriter();

   	  
   	  String u=request.getParameter("username"); 
   	  String p=request.getParameter("password"); 
   	  String d=request.getParameter("DOB");
   	  String a=request.getParameter("Address");

   	  try{ 
   	  Class.forName("com.mysql.jdbc.Driver"); 
   	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin","root","arka");

   	  PreparedStatement ps=con.prepareStatement("insert into users values(?,?,?,?)");

   	 
   	  ps.setString(1,u); 
   	  ps.setString(2,p); 
   	  ps.setString(3,d); 
   	  ps.setString(4,a); 
   	  String str="Select * from users where username='"+ u+"'";
      Statement st = con.createStatement();
      ResultSet rs=st.executeQuery(str);
      
      if(rs.next()){
    	  response.sendRedirect("Registered.jsp");
      }
   	  
   	  

   	  int j=ps.executeUpdate(); 
   	  if(j>0) 
   	  out.print("You are successfully registered...");
   	  

   	  System.out.println("test"); 
   	  }catch (Exception e2) {
   		  ;}

   	  out.close(); 
	}

   	
         

	}


