<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body ng-controller="ctrl">
You are already registered;
Click here to login
<form action="logincheck" method="get">
username<input type="text"  name="username" required> 
password<input type="password"  name="password" required> 
<button type="submit">Login</button>
</form>



</body>
</html>