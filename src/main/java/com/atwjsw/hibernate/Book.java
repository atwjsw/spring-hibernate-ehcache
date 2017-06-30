package com.atwjsw.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by wenda on 6/29/2017.
 */
@Entity
public class Book {

    @Id
    private String isbn;
    private String title;



    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" + "isbn='" + isbn + '\'' + ", title='" + title + '\'' + '}';
    }

}
