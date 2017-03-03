package com.newt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newt.dao.EmployeeDao;
import com.newt.entity.Employee;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		Date admissionDate = null;
		java.sql.Date sqlDate = null;

		String id = request.getParameter("eId");
		int eId = Integer.parseInt(id);
		String name = request.getParameter("eName");

		String sal = request.getParameter("salary");
		double salary = Double.parseDouble(sal);
		String admDate = request.getParameter("hireDate");
		try {
			admissionDate = new SimpleDateFormat("YYYY-MM-dd").parse(admDate);
			sqlDate = new java.sql.Date(admissionDate.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Employee e = new Employee();
		e.seteId(eId);
		e.seteName(name);
		e.setSalary(salary);
		e.setHireDate(sqlDate);

		EmployeeDao edao = new EmployeeDao();
		edao.UpdateEmployee(e);

		out.close();
	}
}
