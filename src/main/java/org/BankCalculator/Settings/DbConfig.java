package org.BankCalculator.Settings;

import org.BankCalculator.Models.Account;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DbConfig {

    public static void Initialize() {
        Session session = null;
        SessionFactory sessionFactory;
        try{
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();

            Account acc1 = new Account();
            acc1.setUsername("Lesley Wood");
            acc1.setAmount(1200.80);
            Account acc2 = new Account();
            acc2.setUsername("Jim Doverfild");
            acc2.setAmount(280.30);
            Account acc3 = new Account();
            acc3.setUsername("Jenny Moon");
            acc3.setAmount(12000.75);
            session.persist(acc1);
            session.persist(acc2);
            session.persist(acc3);
            transaction.commit();

            session.close();
            sessionFactory.close();
        } catch (HibernateException ex) {
            System.out.println("Hibernate Exception occured.");
        } finally {
            System.out.println("Datebase initialized.");
        }
    }
}
