package com.atwjsw.hibernate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-hibernate-context.xml")
public class HibernateTest {


    private static final Logger logger = LoggerFactory.getLogger(HibernateTest.class);

    @Autowired
    private BookDao bookDao;

    @Autowired
    private BookController bookController;

    @Test
    public void testApp()
    {
        logger.info(".... Fetching books");

        logger.info("isbn-1234 -->" + bookController.getBookList());

//        logger.info("isbn-1234 -->" + bookDao.getByIsbn("isbn-1234"));
//        logger.info("isbn-1234 -->" + bookDao.getByIsbn("isbn-1234"));
//        logger.info("isbn-1234 -->" + bookDao.getByIsbn("isbn-1234"));


    }
}
