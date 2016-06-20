package Hibernate;

import org.hibernate.SessionFactory;

/**
 * Created by Oleg on 20.06.2016.
 */
public class test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    }
}
