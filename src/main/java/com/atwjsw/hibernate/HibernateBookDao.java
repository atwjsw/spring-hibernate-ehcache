package com.atwjsw.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

/**
 * Created by wenda on 6/29/2017.
 */
@Repository("bookDao")
public class HibernateBookDao implements BookDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession(){
//        return sessionFactory.getCurrentSession();
        Session session = null;
        try {
            session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }
        return session;
    }

    @Override
    @Cacheable("books")
    public Book getByIsbn(String isbn) {

        simulateSlowService();
        return (Book) currentSession().get(Book.class, isbn);
    }

    // Don't do this at home
    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
