package org.example;

import org.example.Entity.Alien;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Alien a = new Alien();

        a.setName("somesh");
        a.setColor("green");
        a.setUnique_constaint(7);
        a.setUnique_constraint_via_annotation(3);

        Alien fetch = new Alien();



        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alien.class);
        SessionFactory sessionFactory = con.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
//        session.save(a);
        fetch = (Alien) session.get(Alien.class, 702);
        System.out.println(fetch);
        tx.commit();
    }

}
