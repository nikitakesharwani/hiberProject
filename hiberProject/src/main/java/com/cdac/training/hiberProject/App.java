package com.cdac.training.hiberProject;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory sf=cfg.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction t = session.beginTransaction();
        
        Employee e = new Employee();
        
        e.setEid(101);
        e.setFname("Nikita");
        e.setLname("Kesharwani");
        e.setDept("IT");
        e.setSalary(800000);
        
        session.save(e);
        
        t.commit();
        System.out.println("Data Successfully Saved to database");
        session.close();
        sf.close();
        
        
    }
}
