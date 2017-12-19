<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Wellcome page</title>
</head>
<body>


<c:forEach var="i" items="${sessionScope.ls}">
${i.id}
${i.fname}
${i.lname}
	<%
		HttpSession sess=request.getSession();
		out.println("wellcome");
%>
<c:set var="id" value="${i.id}" scope="session">	</c:set>
<c:set var="pwd" value="${i.pwd}" scope="session"></c:set>
	<a href="changpwd.jsp?id=${i.id}">Change password</a>

	</c:forEach>
</body>
</html>