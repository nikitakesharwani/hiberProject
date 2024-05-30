package com.cdac.training.hiberProject;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class PersonApp 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory sf=cfg.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction t = session.beginTransaction();
        
        Person p = new Person();
        
        p.setId(0);
        p.setName("Niki");
        p.setPhno("907878787");
        
        session.save(p);
        
        t.commit();
        System.out.println("Data Successfully Saved to database");
        session.close();
        sf.close();
        
        
    }
}
