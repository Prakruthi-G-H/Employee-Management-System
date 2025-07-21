package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.model.Employee;

public class EmpDao {

	public Boolean addEmployee(Employee e) throws ClassNotFoundException, SQLException {
		Connection c=DBConnection.getconnection();
		String query="INSERT INTO empms(empid,empname,age,salary) VALUES(?,?,?,?)";
		PreparedStatement p=c.prepareStatement(query);
		
		p.setInt(1, e.getEmpid());
		p.setString(2, e.getEmpname());
		p.setInt(3, e.getAge());
		p.setDouble(4,e.getSalary());
		
		int row=p.executeUpdate();
		
		return row>0;
	}

	public ArrayList<Employee> viewEmployee(Employee e) throws ClassNotFoundException, SQLException {
       ArrayList<Employee> em=new ArrayList<Employee>();
		Connection c=DBConnection.getconnection();
		String query="SELECT*FROM empms";
		PreparedStatement p=c.prepareStatement(query);
		
		ResultSet r=p.executeQuery();
		
		while (r.next()) {
			int id=r.getInt(1);
			String name=r.getString(2);
			int age=r.getInt(3);
			double salary=r.getDouble(4);
			Employee e1=new Employee(id, name, age, salary);
			em.add(e1);
		}
		return em;
		
	}

	public Employee search(int empid) throws ClassNotFoundException, SQLException {
		Connection c=DBConnection.getconnection();
		String query="SELECT*FROM empms WHERE EMPID=?";
		PreparedStatement p=c.prepareStatement(query);
		p.setInt(1, empid);
		ResultSet r=p.executeQuery();
	
		if(r.next()) {
		int id=r.getInt(1);
		String name=r.getString(2);
		int age=r.getInt(3);
		double salary=r.getDouble(4);
		
		Employee e=new Employee(empid, name, age, salary);
		
		return e;
		}
		else {
			return null;
		}
	}

	public Boolean updateEmployee(Employee e) throws ClassNotFoundException, SQLException {
		Connection c=DBConnection.getconnection();
		String query="UPDATE empms set empname=?,age=?,salary=? where empid=?";
		PreparedStatement p=c.prepareStatement(query);
		
		p.setString(1, e.getEmpname());
		p.setInt(2, e.getAge());
		p.setDouble(3, e.getSalary());
		p.setInt(4, e.getEmpid());
		
		int row =p.executeUpdate();
		return row>0;
	}

	public Boolean deleteById(int empid) throws ClassNotFoundException, SQLException {
		Connection c=DBConnection.getconnection();
		String query="DELETE FROM empms where empid=?";
		PreparedStatement p=c.prepareStatement(query);
		
		p.setInt(1, empid);
		
		int row=p.executeUpdate();
		
		
		return row>0;
		
		
	}

	
}
