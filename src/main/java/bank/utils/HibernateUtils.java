package bank.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateUtils {
    public static Session getSession(){
        org.hibernate.cfg.Configuration cfg = new org.hibernate.cfg.Configuration();
        cfg.configure();

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        return sessionFactory.openSession();
    }
}
