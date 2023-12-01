package com.example.service.impl;

import com.example.dao.BookDao;
import com.example.dao.UserDao;
import com.example.service.BookService;

public class BookServiceImpl implements BookService{
    private BookDao bookDao;
    private UserDao userDao;

    // 构造器注入！！
    public BookServiceImpl(BookDao bookDao1, UserDao userDao1) {
        this.bookDao=bookDao1;
        this.userDao=userDao1;
    }
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
