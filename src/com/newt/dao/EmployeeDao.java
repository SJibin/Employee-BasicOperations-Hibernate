package com.newt.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.newt.entity.Employee;
import com.newt.util.HibernateUtil;

public class EmployeeDao {
	public void createEmployee(Employee u) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		tx.begin();
		session.save(u);
		tx.commit();
		session.close();
	}

	public Employee getEmployee(int id) {
		String query = "from Employee u where u.eId=:id";
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		tx.begin();
		Query q = session.createQuery(query);
		q.setParameter("id", id);
		Employee employee = (Employee) q.uniqueResult();
		return employee;
	}

	public void UpdateEmployee(Employee e) {
		String query = "update Employee set eName=:name,salary=:salary,hireDate=:date where eId=:id";
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		tx.begin();
		Query q = session.createQuery(query);
		q.setParameter("id", e.geteId());
		q.setParameter("name", e.geteName());
		q.setParameter("salary", e.getSalary());
		q.setParameter("date", e.getHireDate());
		q.executeUpdate();
		tx.commit();
		session.close();
	}

	public int deleteEmployee(int id) {
		String query = "delete from Employee WHERE eId = :id";
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		tx.begin();
		Query q = session.createQuery(query);
		q.setParameter("id", id);
		int i = q.executeUpdate();
		tx.commit();
		session.close();
		return i;
	}
}
