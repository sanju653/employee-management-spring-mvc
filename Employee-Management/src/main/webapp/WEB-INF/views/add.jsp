<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="False"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">

</head>
<body>
<h2>Add Employee</h2>
<c:if test="${not empty error}">
    <p style="color:red;">
        ${error}
    </p>
</c:if>

<form action="${pageContext.request.contextPath}/employee/save" method="post">

    Name: <input type="text" name="name"/><br>
    <c:if test="${not empty nameError}">
        <span style="color:red">${nameError}</span>
    </c:if>
    <br><br>
    
    

    Email: <input type="text" name="email"/><br>
      <c:if test="${not empty emailError}">
        <span style="color:red">${emailError}</span>
    </c:if>
    <br><br>

    Salary: <input type="text" name="salary"/><br>
     <c:if test="${not empty salaryError}">
        <span style="color:red">${salaryError}</span>
    </c:if>
    <br><br>

    Department:
    <select name="department.id">
        <option value="">-- Select Department --</option>
        <c:forEach var="dept" items="${departments}">
            <option value="${dept.id}">${dept.name}</option>
        </c:forEach>
    </select><br>
     <c:if test="${not empty deptError}">
        <span style="color:red">${deptError}</span>
    </c:if>
<br><br><br>

    <input type="submit" value="Save">

</form>
</body>
</html>