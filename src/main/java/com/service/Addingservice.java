package com.service;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmpDao;
import com.model.Employee;

public class Addingservice extends HttpServlet{
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	  int empid=Integer.parseInt(req.getParameter("empid"));
	  String empname=req.getParameter("ename");
	  int age=Integer.parseInt(req.getParameter("age"));
	  double salary=Double.parseDouble(req.getParameter("sal"));
	  
	 Employee e=new Employee(empid, empname, age, salary) ;
	 
	 EmpDao d=new EmpDao();
	 
	 Boolean success=false;
	
		try {
			success = d.addEmployee(e);
		} catch (Exception e1) {
			 e1.printStackTrace();
			    resp.getWriter().println("Error: " + e1.getMessage());
			    return;
		} 
	
	 
	 String name="Added";
	 req.setAttribute("name", name);
	 req.setAttribute("empname", empname);
	 if (success) {
		RequestDispatcher rd=req.getRequestDispatcher("success.jsp");
		rd.forward(req, resp);
	} else {
		resp.getWriter().println("Adding employee details failed");
        RequestDispatcher rd=req.getRequestDispatcher("addEmployee.html");
        rd.include(req, resp);
	}
	 
}
}
