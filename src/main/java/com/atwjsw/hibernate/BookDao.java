package com.atwjsw.hibernate;

/**
 * Created by wenda on 6/29/2017.
 */
public interface BookDao {

    Book getByIsbn(String isbn);

}
