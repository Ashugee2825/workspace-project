package com.demo.oneToMany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
Subject s1 = new Subject("java", "Omkar", "6months");
Student stu1 = new Student("Prahllad", "99", "prahalld@kodnet.com",s1);
Student stu2 = new Student("Bharadwa", "98", "Bhahalld@kodnet.com",s1);
ArrayList<Student> list = new ArrayList<>();
list.add(stu1);
list.add(stu2);
s1.setStulist(list);
SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

Session session = factory.openSession();
Transaction transaction = session.beginTransaction();
session.persist(s1);
transaction.commit();
session.close();
factory.close();

    }
}
