package com.adminportal.repository;

import com.adminportal.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by carlosarosemena on 2017-06-21.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
