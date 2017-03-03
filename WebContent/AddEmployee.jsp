<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
<h1>Add New Employee</h1>
	<form action="SaveServlet" method="post">
		<table>
			
			<tr>
				<td>Employee Name:</td>
				<td><input type="text" name="eName" /></td>
			</tr>
			<tr>
				<td>Salary:</td>
				<td><input type="text" name="salary" /></td>
			</tr>
			
			<tr>
			<td>Hire Date:</td>
			<td><input type="date" name="hireDate"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add" /></td>
				<td colspan="2"><a href="ViewId.jsp"><input type="button" value="View"></a></td>
				<td colspan="2"><a href="UpdateEmployee.jsp"><input type="button" value="Update"></a></td>
				<td colspan="2"><a href="Delete.jsp"><input type="button" value="Delete"></a></td>
			</tr>
		</table>
	</form>

</body>
</html>