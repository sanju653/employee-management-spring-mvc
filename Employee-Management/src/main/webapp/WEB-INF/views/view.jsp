<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">

</head>
<body>
<h2>Employee List</h2>
<div class="table-container">
<table border="1">
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Email</th>
    <th>Salary</th>
    <th>Department</th>
    <th>Action</th>
</tr>

<c:forEach var="emp" items="${employees}">
<tr>
    <td>${emp.id}</td>
    <td>${emp.name}</td>
    <td>${emp.email}</td>
    <td>${emp.salary}</td>
    <td>${emp.department.name}</td>

    <td>
        <a href="edit/${emp.id}">Edit</a> |
        <a href="delete/${emp.id}">Delete</a>
    </td>
</tr>
</c:forEach>

</table>
</div>
<br>
<div class="bottom">

<a href="add">Add New Employee</a></div>
</body>
</html>