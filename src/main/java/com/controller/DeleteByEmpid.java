package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmpDao;
import com.model.Employee;

public class DeleteByEmpid extends HttpServlet{
  
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int empid=Integer.parseInt(req.getParameter("empid"));
		
	
		
		EmpDao d=new EmpDao();
		
    Boolean success=false;
		
		try {
			success = d.deleteById(empid);
		} catch (Exception e1) {
			 e1.printStackTrace();
			    resp.getWriter().println("Error: " + e1.getMessage());
			    return;
		} 
		
		 String name="Deleted";
		 req.setAttribute("name", name);
		 if (success) {
			RequestDispatcher rd=req.getRequestDispatcher("success.jsp");
			rd.forward(req, resp);
		} else {
			resp.setContentType("text/html");
			resp.getWriter().println("Delete employee failed");
	        RequestDispatcher rd=req.getRequestDispatcher("delete.html");
	        rd.include(req, resp);
		}
	}
	
}
