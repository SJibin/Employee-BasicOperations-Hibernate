package com.newt.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="eId")
	private int eId;
	@Column(name="eName")
	private String eName;
	@Column(name="salary")
	private double salary;
	@Column(name="hireDate")
	private Date hireDate;
	public Employee() {
		super();
	}
	public Employee(int eId, String eName, double salary, Date hireDate) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
/*	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", salary=" + salary + ", hireDate=" + hireDate + "]";
	}
	*/
	
}
