<%@page import="javafx.scene.control.Alert"%>
<%@page import="com.sun.java.swing.plaf.windows.resources.windows"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
<head>
<script type="text/javascript" src="angul.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head >
<body>



<script type="text/javascript">
    
        <% if(session.getAttribute("username")==null)
        { %>
          
           alert("you are not logged in")
            
          <%
          
        }
       %>

   
</script>

        <% if(session.getAttribute("username")==null)
        {
          
           
            
          response.sendRedirect("NewFile.jsp");
          
        }
       %>

    

Welcome To the world!!!!
</body>
</html>