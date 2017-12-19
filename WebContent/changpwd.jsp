<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="all_contro_op" method="post">
<table width ="900px" height = "80px">
	<tr>
		<td>Old Password</td>
		<td><input type ="text" name="oldpwd"/> </td>
	</tr> 
	<tr>
		<td>New Password</td>
		<td><input type ="password" name="npwd"/> </td>
	</tr>
	<tr>
		<td>Conform Password</td>
		<td><input type ="password" name="cpwd"/> </td>
	</tr> 
	<tr>
	<td>
	<input type="hidden" value="cpwd" name="flag">
	<input type="submit" value="submit">
	</td></tr>
	<%-- <%
	String id=request.getParameter("id");
	int i1=Integer.parseInt(request.getParameter("id"));
	
	out.println(i1);
	%> --%>
</table>
</form>
</body>
</html>