package com.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmpDao;
import com.model.Employee;

public class ViewEmployee extends HttpServlet{
	  @Override
	  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  Employee e=new Employee();
		  EmpDao d=new EmpDao();
		  
		  ArrayList<Employee> e2 = null;
		  
		
			try {
				e2= d.viewEmployee(e);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
		 
		 req.setAttribute("emplist", e2);
		
		  
		  resp.setContentType("text/html");
	  	  resp.getWriter().println("Welcome to View Employee ");
	  	  RequestDispatcher rd=req.getRequestDispatcher("viewemployee.jsp");
	  	  rd.include(req, resp);
	  }
}
