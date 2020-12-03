package com.allen.dao;

import com.allen.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Allen
 * @date 2020/12/2 15:21
 */
public interface BookMapper {

    int addBook(Books books);

    int deleteBookById(@Param("bookId") int id);

    int updateBook(Books books);

    Books queryBookById(@Param("bookId") int id);

    List<Books> queryAllBooks();

    Books queryBookByName(@Param("bookName") String name);
}
