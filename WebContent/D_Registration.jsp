<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="controller.*"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="all_contro_op" method="post" >
<table>
	<tr>
		<td>First Name</td>
		<td><input type ="text" value =""  name="fn" id =""/> </td>
	</tr>
	<tr>
		<td> Last Name</td>
		<td><input type ="text" value =""  name="ln" id =""/> </td>
	</tr>
	<tr>
		<td> user Name </td>
		<td><input type ="text" value =""  name="un" id =""/> </td>
	</tr> 
	<tr>
		<td> Password </td>
		<td><input type ="password" name="pwd"/> </td>
	</tr> 
	<tr>
		<td> Address </td>
		<td> <textarea name="add"></textarea><td>
	</tr>
	<tr>
		<td> City </td>
		<td>
			<select name="city">
			 <option> Ahmedabad </option> 
			 <option> Modasa </option>
			 <option> Rajkot </option>
			 <option> Junagadh </option> 
			</select>	
		</td>
	</tr>
	<tr>
		<td>
			<input type="hidden" name="flag" value="insert"/>
			<input type ="Submit" value="register" name="temp"/>
			<input type ="Reset" />
		</td>
	</tr>

</table>
</form>	
</body>
</html>