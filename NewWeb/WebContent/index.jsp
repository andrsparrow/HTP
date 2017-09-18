<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1;encoding=UTF-8">
<title>authorization</title>
</head>
<body>
	<form action='Controller' method='GET'>
		<p>user name<input type="text" name='user_name' /></p>
		<p>password<input type="text" name='password' /></p>
		<input type='hidden' name='command' value='login' />
		<input type="submit" value='login' />
	</form>
</body>
</html>