<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="False"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">

</head>
<body>
<form action="${pageContext.request.contextPath}/employee/update" method="post">

    <input type="hidden" name="id" value="${employee.id}"/>

    Name: 
    <input type="text" name="name" value="${employee.name}"/><br><br>

    Email: 
    <input type="text" name="email" value="${employee.email}"/><br><br>

    Salary: 
    <input type="text" name="salary" value="${employee.salary}"/><br><br>
Department:
    <select name="department.id">

        <c:forEach var="dept" items="${departments}">
            <option value="${dept.id}"
                <c:if test="${dept.id == employee.department.id}">
                    selected
                </c:if>
            >
                ${dept.name}
            </option>
        </c:forEach>

    </select>

    <br><br>

    <input type="submit" value="Update">

</form>

<br>
<a href="${pageContext.request.contextPath}/employee/view">Back to List</a>

</body>
</html>