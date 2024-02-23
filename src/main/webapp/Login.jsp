<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="login" method="post">
		<table>
			<tr>
				<td>Email :</td>
				<td><input type="email" name="email"
					placeholder="Enter your email"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="password"
					placeholder="Enter your password"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form>
</body>
</html>