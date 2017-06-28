package com.adminportal.service;

import com.adminportal.domain.Book;

import java.util.List;

/**
 * Created by carlosarosemena on 2017-06-21.
 */
public interface BookService {

    Book save(Book book);
    List<Book> findAll();
    Book findOne(Long id);
}
