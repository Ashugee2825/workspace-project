package com.demo.manytomany;

import java.util.ArrayList;


import org.hibernate.Session;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.Query;
import com.mysql.cj.xdevapi.SessionFactory;
import com.sun.tools.javac.util.List;

/**
 * Hello world!
 *
 */
public class App2
{
    public static void main( String[] args) {
      //object creations
    	
 
// Hibernate related code...
SessionFactory factory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
 Session   session = factory.openSession();
 Transaction transaction = session.beginTransaction(); 
 
 String hql = " from Employee Where salary> 2000";
 Query  query = session.createQuery(hql, Employee.class);
 List<Employee> emplist =query.getResultList();
 for(Employee employee : emplist) {
	 System.out.println(employee.getId()+" " +employee.getName()+" "+ employee.getSalary());
 }
 transaction.commit();
 session.close();
  // factory.close();
    }
}
