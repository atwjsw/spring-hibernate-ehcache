package com.atwjsw.cache;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Hello world!
 *
 */
public class App 
{

    @Autowired
    private BookRepository bookRepository;

//    public App(BookDao bookRepository) {
//        this.bookRepository = bookRepository;
//    }

    public static void main( String[] args ) throws Exception {
        System.out.println(new App().bookRepository);
    }
}
