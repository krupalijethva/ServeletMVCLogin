<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1px solid black">
<tr>
<th>Id</th>
<th>Fnmae</th>
<th>Lname</th>
<th>Unmae</th>
<th>Pwd</th>
<th>Address</th>
<th>city</th>
</tr>
<c:forEach items="${sessionScope.list}" var="i">
<tr><td>${i.id}</td>
<td>${i.fname}</td>
<td>${i.lname}</td>
<td>${i.uname}</td>
<td>${i.pwd}</td>
<td>${i.address}</td>
<td>${i.city}</td>
<td><a href="all_contro_op?id=${i.id}&flag=delete">delete</a></td>
<td><a href="all_contro_op?id=${i.id}&flag=edit">edit</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>