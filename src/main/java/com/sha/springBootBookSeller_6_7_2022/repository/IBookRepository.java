package com.sha.springBootBookSeller_6_7_2022.repository;

import com.sha.springBootBookSeller_6_7_2022.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book,Long> {

}
