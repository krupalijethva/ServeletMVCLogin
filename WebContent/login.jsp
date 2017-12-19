<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="all_contro_op" >
<table width ="900px" height = "80px">
	<tr>
		<td> user Name </td>
		<td><input type ="text" name="uname"/> </td>
	</tr> 
	<tr>
		<td> Password </td>
		<td><input type ="password" name="pwd"/> </td>
	</tr> 
	<tr>
	<td>
	<%-- <%
	String s2=(String)session.getAttribute("w");
		if(s2!=null)
		{
			out.println(s2);
			session.removeAttribute("w");
		}%> --%>
		</td>
	</tr>
	<tr>
		<td><input type="hidden" value="verify" name="flag">
		<input type ="Submit" value="login" name="temp"/></td>
		<td><a href="mvc_reg.jsp" ><input type="button"  value="singup" name="temp"/></a></td>
		
	</tr>

</table>
</form>	

</body>
</html>