<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*,com.model.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  
   <table border="1">
    <tr>
            <th>EmpID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Salary</th>
        </tr>
        
        
        <% ArrayList<Employee> e=(ArrayList<Employee>)request.getAttribute("emplist");
        
        if(e!=null && !e.isEmpty()){
        	
        for(Employee emp:e){
        
        %>
    <tr>
        <td><%= emp.getEmpid() %></td>
        <td><%= emp.getEmpname()  %></td>
        <td><%= emp.getAge() %></td>
        <td><%= emp.getSalary() %></td>
    </tr>
   <%
        }
    } else {
%>
  <tr>
        <td colspan="4">No employee records found.</td>
    </tr>
<%
    }
%>
   
   </table>
</body>
</html>