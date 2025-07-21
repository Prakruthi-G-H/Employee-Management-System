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

public class SearchandUpdateEmployee extends HttpServlet {
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
    	 int empid=Integer.parseInt(req.getParameter("empid"));
    	 
    	 EmpDao d=new EmpDao();
    	 Employee ee = null;
    	  try {
			ee=d.search(empid);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
    	  req.setAttribute("emp", ee);
    	  resp.setContentType("text/html");
    	  RequestDispatcher rd=req.getRequestDispatcher("updateemployee.jsp");
    	  rd.forward(req, resp);
    	  
    	  
     }
}

