package com.bridgeit.spring_HiberDemo;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeDao {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void saveEmp(Employee employee) {
		Session session = getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		session.save(employee);
		transaction.commit();
		session.close();

	}

	/*public List<Employee> selectAll() {
		Session session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> persons = (List<Employee>) criteria.list();
		session.getTransaction().commit();
		return persons;
	}*/

}
