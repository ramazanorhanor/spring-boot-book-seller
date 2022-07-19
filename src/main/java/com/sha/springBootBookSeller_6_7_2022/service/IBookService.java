package com.sha.springBootBookSeller_6_7_2022.service;

import com.sha.springBootBookSeller_6_7_2022.model.Book;

import java.util.List;

public interface IBookService {
    Book saveBook(Book book);

    void deleteBook(Long id);

    List<Book> findAllBooks();
}
