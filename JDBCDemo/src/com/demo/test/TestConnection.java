package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {

	public static void main(String[] args) {
		//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		String url = "jdbc:derby:c:\\mydata\\hsbcdb";
        String user = "hsbc";
        String password = "hsbc123";
        Connection conn=null;
		try {
			conn = DriverManager.getConnection(url, user, password);
			if (conn != null) {
	            System.out.println("Connected to database ");
	        }
		} catch (SQLException e) {
			System.out.println("Connection not done ");
			e.printStackTrace();
		}
		
		///create statement
		
		try {
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from employee");
			while(rs.next()) {
				System.out.println("Id :"+rs.getInt(1));
				System.out.println("name : "+rs.getString(2));
				System.out.println("Sal :"+rs.getDouble(3));
				System.out.println("DOJ : "+rs.getDate(4));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			PreparedStatement ps=conn.prepareStatement("select * from employee where empid=? and ename=?");
			int id=13;
			ps.setInt(1, id);
			ps.setString(2, "Rajan");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("Id :"+rs.getInt(1));
				System.out.println("name : "+rs.getString(2));
				System.out.println("Sal :"+rs.getDouble(3));
				System.out.println("DOJ : "+rs.getDate(4));
			}
			PreparedStatement ps1=conn.prepareStatement("insert into employee(empid,ename,sal,deptid) values(?,?,?,?)");
			ps1.setInt(1, 111);
			ps1.setString(2, "Rajasi");
			ps1.setDouble(3, 1111.99);
			//ps.setDate(4, "12/11/2110");
			ps1.setInt(4, 2);
			int n=ps1.executeUpdate();
			if(n>0) {
				System.out.println("insertion done");
			}
			else {
				System.out.println("insertion not done");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
        
	}
}
