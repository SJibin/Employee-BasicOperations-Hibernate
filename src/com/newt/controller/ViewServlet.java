package com.newt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newt.dao.EmployeeDao;
import com.newt.entity.Employee;


public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDao dao=new EmployeeDao();
		response.setContentType("text/html");
		String id = request.getParameter("ssId");
		int sId = Integer.parseInt(id);
		Employee employee = dao.getEmployee(sId);
		request.setAttribute("emp", employee);
		RequestDispatcher rsd = request.getRequestDispatcher("View.jsp");		
		rsd.forward(request, response);
	}

}
