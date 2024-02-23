<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String message = (String) request.getAttribute("message");
	if (message != null) {
	%>
	<h3><%=message%></h3>
	<%
	}
	%>
	<table>
		<tr>
			<td><a href="home.jsp"><button>HOME</button></a></td>
			<td><a href="login.jsp"><button>LOGIN</button></a></td>
		</tr>
	</table>
</body>
</html>