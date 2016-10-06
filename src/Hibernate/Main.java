package Hibernate;

import dictbase.Word;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import window.ProgramWindow;

import javax.swing.*;



/**
 * Created by Oleg on 20.06.2016.
 */
public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        JFrame englearn = new ProgramWindow();
        englearn.setVisible(true);

    }

    private static void addWord(String eng, String ua) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Word w= new Word();
        w.setEnglish(eng);
        w.setUkrainian(ua);
        session.save(w);
        session.getTransaction().commit();
        session.close();
    }

}
