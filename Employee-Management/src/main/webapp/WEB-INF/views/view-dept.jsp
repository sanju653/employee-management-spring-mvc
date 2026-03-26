<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Department List</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">

</head>
<body>
<h2>Department List</h2>

<table border="1">
<tr>
    <th>ID</th>
    <th>Name</th>
</tr>

<c:forEach var="dept" items="${departments}">
<tr>
    <td>${dept.id}</td>
    <td>${dept.name}</td>
</tr>
</c:forEach>

</table>

<br>
<a href="${pageContext.request.contextPath}/department/add">Add Department</a>

</body>
</html>