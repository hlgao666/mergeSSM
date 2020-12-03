package com.allen.controller;

import com.allen.pojo.Books;
import com.allen.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Allen
 * @date 2020/12/2 17:00
 */
@Controller
@RequestMapping("/book")    //方便业务扩展
public class BookController {
    //Controller 层调用 Service 层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //跳转到所有书籍界面
    @RequestMapping("/allbook")
    public String list(Model model){
        List<Books> books = bookService.queryAllBooks();

        model.addAttribute("list",books);
        return "/allbook";
    }

    //跳转到添加书籍界面
    @RequestMapping("/addBook")
    public String toAddBook(){

        return "/addBook";
    }

    //提交新增书籍，并重定向回所有书籍界面
    @RequestMapping("/addbook")
    public String addBook(Books books){
        bookService.addBook(books);
        return "redirect:/book/allbook";
    }

    //跳转到修改页面
    @RequestMapping("/updateBook")
    public String toUpdateBook(int id,Model model){
        Books book = bookService.queryBookById(id);
        model.addAttribute("book",book);
        return "/updateBook";
    }

    //修改书籍，并重定向回所有书籍界面
    @RequestMapping("/updatebook")
    public String updateBook(Books books){
        bookService.updateBook(books);
        return "redirect:/book/allbook";
    }


    //删除书籍，并重定向回此界面
    @RequestMapping("/deleteBook")
    public String deleteBook(int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allbook";
    }

    //查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String bookName, Model model){
        Books book = bookService.queryBookByName(bookName);
        System.out.println(book);
        ArrayList<Books> list = new ArrayList<>();
        list.add(book);
        model.addAttribute("list",list);
        return "/allbook";
    }

}
