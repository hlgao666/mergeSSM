package com.allen.service;

import com.allen.dao.BookMapper;
import com.allen.pojo.Books;

import java.util.List;

/**
 * @author Allen
 * @date 2020/12/2 15:45
 */
public class BookServiceImpl implements BookService {

    //service 层调用 dao 层
    private BookMapper bookMapper;
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }

    @Override
    public Books queryBookByName(String name){
        return bookMapper.queryBookByName(name);
    }
}
