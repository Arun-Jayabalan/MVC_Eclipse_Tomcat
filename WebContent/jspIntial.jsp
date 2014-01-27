<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>There is No name and Email</title>
</head>
<body>
Please provide the name and eMail .....
<form action="ServletController" method="POST">
	<label>Name</label><input name="name"></input>
	<label>Mail</label><input name="mail"></input>
	<button type="submit">Submit</button>
</form>
</body>
</html>