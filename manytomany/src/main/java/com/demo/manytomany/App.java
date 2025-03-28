package com.demo.manytomany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.xdevapi.SessionFactory;
import com.sun.tools.javac.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args) {
      //object creations
    	Course course1 = new Course();
    	course1.setTitle("SDE-1");
        Course course2 = new Course();
    	course1.setTitle("SDET");
    	Student student1 = new Student();
    	student1.setName("Pavan");
    	Student student2 = new Student();
    	student2.setName("Ashutosh");
    	List<Course> clist = new ArrayList()<>();
    	clist.add(course1);
    	clist.add(course2);
    	List<Student> slist = new ArrayList<>();
    	slist.add(student1);
    	slist.add(student2);
 
// Hibernate related code...
SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFacyory(;
 Session   session = factory.openSession();
 Transaction transaction = session.beginTransaction(); 
 session.persist(student1);
 session.persist(course1);
 session.close();
 factory.close();
    }
}
