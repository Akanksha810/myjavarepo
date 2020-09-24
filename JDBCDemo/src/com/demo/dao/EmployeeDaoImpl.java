package com.demo.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	static Connection conn;
	static PreparedStatement psins,pssel,psbyId,psdel;
	static {
		conn=DBUtil.getMyConnection();
		try {
			 psins=conn.prepareStatement("insert into employee values(?,?,?,?,?)");
			 pssel=conn.prepareStatement("select * from employee");
			 psbyId=conn.prepareStatement("select * from employee where empid=?");
			 psdel=conn.prepareStatement("delete from employee where empid=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int addEmployee(Employee e) {
		        
		        try {
		        	psins.setInt(1,e.getEmpid());
					psins.setString(2, e.getEname());
					psins.setDouble(3, e.getSal());
			        java.sql.Date dt=new java.sql.Date(e.getDoj().getTime());
			        psins.setDate(4, dt);
			        psins.setInt(5, e.getDeptid());
					return psins.executeUpdate();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					
					e1.printStackTrace();
					return 0;
				}
		        
	}

	@Override
	public void closeConnection() {
		DBUtil.closeMyConnection();
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> elist=new ArrayList<>();
		try {
			ResultSet rs=pssel.executeQuery();
			while(rs.next()) {
				Employee e=new Employee(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getDate(4),rs.getInt(5));
				elist.add(e);
			}
			return elist;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Employee searchEmployeeById(int id) {
		try {
			psbyId.setInt(1,id);
			ResultSet rs=psbyId.executeQuery();
			if(rs.next()) {
				Employee e=new Employee(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getDate(4),rs.getInt(5));
				return e;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public boolean deleteEmployee(int id) {
		try {
			psdel.setInt(1,id);
			int n=psdel.executeUpdate();
			if(n>0)
				return true;
			else 
				return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

}
