<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app = "app">

<head>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular.min.js"></script>
<script type="text/javascript" src="angul.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.5/angular-route.min.js"></script>
<link href="style.css" type="tect/css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login File</title>
</head>


<body ng-controller="ctrl">
   <div class="homepage">
  
  
  <form action="logincheck"  method="get">
 
 
  <div class="input">
  Username<input type="text" value={{username}} name="username" required>
  password<input type="password" value={{password}} name="password" required>
  
 </div>
  <div id="buttons">
  
  <button type="submit">Login</button>
    </div>

   </form>
<div id="buttons"> 
 <button  ng-click="register()">Register</button>
 </div>
   </div>

</body>
</html>