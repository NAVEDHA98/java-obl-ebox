<%@ page language="java" contentType="text/html; charset=UTF-8"
 import="java.util.*,com.example.springMvcExample.Employee"    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
List employeeList=(List)request.getAttribute("list");
System.out.println(employeeList);
%>


<table>
<tr>
<td>id<td>
<td>name</td>
</tr>

<% for(int i=0;i<employeeList.size();i++){
	Employee e=(Employee)employeeList.get(i);
	%>
<tr>
<td><%= e.getEmployeeId() %><td>
<td><%= e.getName() %></td>
</tr>
<% }%>

</table>


</table>

</body>
</html>