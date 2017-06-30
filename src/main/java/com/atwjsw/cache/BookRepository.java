package com.atwjsw.cache;

/**
 * Created by wenda on 6/29/2017.
 */
public interface BookRepository {

    Book getByIsbn(String isbn);

}
