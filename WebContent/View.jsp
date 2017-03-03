<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="j" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
<h3>Your Employee Details</h3>
<table border="1">
<tr><th>Employee Id</th><th>Employee Name</th><th>Salary</th><th>Hire Date</th></tr>
<tr><td>${emp.eId }</td><td>${emp.eName}</td><td>${emp.salary}</td><td>${emp.hireDate}</td>
</tr>
<tr><td colspan="2"><a href="AddEmployee.jsp"><input type="button" value="Add"></a></td>
<td colspan="2"><a href="UpdateEmployee.jsp"><input type="button" value="Update"></a></td>
</tr>
</table>
<a href="Delete.jsp"><input type="button" value="Delete"></a>
</body>
</html>