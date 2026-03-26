<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">

</head>
<body>

<h2>Employee Management System</h2>
<div class="container">
<a href="${pageContext.request.contextPath}/employee/add">Add Employee</a><br><br>
<a href="${pageContext.request.contextPath}/employee/view">View Employees</a><br><br>

<a href="${pageContext.request.contextPath}/department/add">Add Department</a><br><br>
<a href="${pageContext.request.contextPath}/department/view">View Departments</a>
</div>
</body>
</html>
