package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmpDao;
import com.model.Employee;

public class UpdateByEmpId extends HttpServlet{
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	  int id=Integer.parseInt(req.getParameter("empid"));
	  String empname=req.getParameter("empname");
	  int age=Integer.parseInt(req.getParameter("age"));
	  double salary=Double.parseDouble(req.getParameter("salary"));
	  
	  Employee e=new Employee(id, empname, age, salary);
	  
	  EmpDao d=new EmpDao();
	  Boolean success=false;
		
		try {
			success = d.updateEmployee(e);
		} catch (Exception e1) {
			 e1.printStackTrace();
			    resp.getWriter().println("Error: " + e1.getMessage());
			    return;
		} 
		
		 String name="Updated";
		 req.setAttribute("name", name);
		 req.setAttribute("empname", empname);
		 if (success) {
			RequestDispatcher rd=req.getRequestDispatcher("success.jsp");
			rd.forward(req, resp);
		} else {
			resp.getWriter().println("Updating employee details failed");
	        RequestDispatcher rd=req.getRequestDispatcher("addEmployee.html");
	        rd.include(req, resp);
		}
		 
}
}
