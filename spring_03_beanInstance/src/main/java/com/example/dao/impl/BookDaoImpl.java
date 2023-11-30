package com.example.dao.impl;

import com.example.dao.BookDao;

public class BookDaoImpl implements BookDao {

    /*
     * 实例化bean方式一：
     * 调用无参构造期（默认有或者自己写），如果没有无参构造器就会报BeanCreationException异常
     *
     */
    public BookDaoImpl() {
        System.out.println("book dao constructor is running ....");
    }

    public void save() {
        System.out.println("book dao save ...");
    }

}
