package com.demo.bean;

import java.util.Date;

public class Employee {
	private int empid;
	private String ename;
	private double sal;
	private Date doj;
	private int deptid;
	
	public Employee() {
		super();
	}

	public Employee(int empid, String ename, double sal, Date doj, int deptid) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
		this.doj = doj;
		this.deptid = deptid;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", sal=" + sal + ", doj=" + doj + ", deptid=" + deptid
				+ "]";
	}
	

}
