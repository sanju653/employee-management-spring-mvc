<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Department</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">

</head>
<body>
<h2>Add Department</h2>

<form action="${pageContext.request.contextPath}/department/save" method="post">

    Department Name:
    <input type="text" name="name"/><br>
     <c:if test="${not empty deptNameError}">
        <div style="color:red">${deptNameError}</div>
    </c:if>
    <br>

    <input type="submit" value="Save">

</form>

<br>
<a href="${pageContext.request.contextPath}/department/view">View Departments</a>


</body>
</html>