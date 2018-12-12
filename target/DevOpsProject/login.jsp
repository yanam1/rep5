<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body bgcolor="blue"><br/>
<img src="images/git.png" height="5%" width="7%" align="right"/></br>
<h2 align="center"><font color="white">Welcome to DevOps Tutorial</font></h2>
<h4 align="right"><a href="" ><font color="orange">New User Click here to Register</font></a></h4>
<%
	HttpSession se = request.getSession();
	String user = (String)se.getAttribute("username");
%>
<h2><b><i></i></b><font color="white">Welcome <%=user %> </font></b></i></h2><br/>
<h4><font color="white">You are Logged in Successfully ..!</font></h4>

</body>
</html>