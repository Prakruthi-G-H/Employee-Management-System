<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="java.util.*" %>
     
    <%@ page import="com.model.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <form action="updatingform" method="post">
    <table border="1">
    <tr>
            <th>EmpID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Salary</th>
        </tr>
    <%
Employee ee = (Employee) request.getAttribute("emp");
if (ee != null) {
%>
     <tr>
            <td><input type="text" name="empid" value="<%= ee.getEmpid() %>" readonly></td>
            <td><input type="text" name="empname" value="<%= ee.getEmpname() %>"></td>
            <td><input type="text" name="age" value="<%= ee.getAge() %>"></td>
            <td><input type="text" name="salary" value="<%= ee.getSalary() %>"></td>
        </tr>
<%
} else {
%>
    <tr>
        <td colspan="4">No employee found with this ID.</td>
    </tr>
<%
}
%>

   </table>
   
   <button type="submit">Update now</button>
 </form>
</body>
</html>