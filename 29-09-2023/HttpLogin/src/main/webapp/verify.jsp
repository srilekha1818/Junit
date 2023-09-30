<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Validation Page</title>
</head>
<body>

	<%
		//read form data
		String username = request.getParameter("uname");
		String password = request.getParameter("password");
	
		//No inputs
		if (username.equals("") || password.equals("") || username.length() == 0 || password.length() == 0) {
			out.println("please,provide credentials!!");
			return;
		}
	
		//Provide logic for authentication
		if (username.equalsIgnoreCase("srilekha")&& password.equals("kavuri"))
			out.println("Provided valid credentials");
		else
			out.println("These are invalid credentials");
	%>
</body>
</html>