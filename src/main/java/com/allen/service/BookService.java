package com.allen.service;

import com.allen.pojo.Books;

import java.util.List;
import java.util.Map;

/**
 * @author Allen
 * @date 2020/12/2 15:43
 */
public interface BookService {
    int addBook(Books books);

    int deleteBookById(int id);

    int updateBook(Books books);

    Books queryBookById(int id);

    List<Books> queryAllBooks();

    Books queryBookByName(String name);
}
