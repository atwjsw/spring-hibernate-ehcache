package com.atwjsw.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenda on 6/29/2017.
 */
@Controller
//@RequestMapping("/")
public class BookController {

    private static final Logger logger = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping("/books/repo/")
    @ResponseBody
    public List<Book> getBookList() {
        List<Book> bookList = new ArrayList<Book>();

        logger.info(".... Fetching books");
        logger.info("isbn-1234 -->" + bookList.add(bookRepository.getByIsbn("isbn-1234")));
        logger.info("isbn-1234 -->" + bookList.add(bookRepository.getByIsbn("isbn-1234")));
        logger.info("isbn-1234 -->" + bookList.add(bookRepository.getByIsbn("isbn-1234")));
        return bookList;
    }
}