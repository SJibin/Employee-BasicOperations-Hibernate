package com.newt.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newt.dao.EmployeeDao;

public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EmployeeDao dao = new EmployeeDao();
		PrintWriter out = response.getWriter();
		String sid = request.getParameter("id");
		int id = Integer.parseInt(sid);
		int i = dao.deleteEmployee(id);
		if (i > 0) {
			out.println("<p>Record Delete successfully!</p>");
		} else {
			log("Sorry! unable to Delete record");
		}
	}

}
