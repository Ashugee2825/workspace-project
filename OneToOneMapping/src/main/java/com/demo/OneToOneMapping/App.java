package com.demo.OneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args ) {
    	
    	//create Objects 
    	Productimage productimage = new Productimage("https://www.google.com");
        Product product = new Product("Louies Shirt", 999,20,productimage);
    
    SessionFactory  factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    Session session =factory.openSession();
    Transaction transaction = session.beginTransaction(); 
    
    
    session.persist(productimage);
    transaction.commit();
    transaction = session.beginTransaction();
    transaction.commit();
    session.close();
    factory.close();
    
    }
}


