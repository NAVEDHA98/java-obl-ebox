<%@ page language="java" contentType="text/html; charset=UTF-8"
 import="java.util.*,com.example.stockspring.model.Company"    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
List companyList=(List)request.getAttribute("companyList");
System.out.println(companyList);
%>


<table>
<tr>
<td>id<td>
<td>Board of Directory</td>
</tr>

<% for(int i=0;i<companyList.size();i++){
	Company e=(Company)companyList.get(i);
	%>
<tr>
<td><%= e.getCompanyId() %><td>
<td><%= e.getBoardofdirectors() %></td>
</tr>
<% }%>

</table>


</table>

</body>
</html>