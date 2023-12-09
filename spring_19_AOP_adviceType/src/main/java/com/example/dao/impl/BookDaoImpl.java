package com.example.dao.impl;

import com.example.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    public void save() {
        System.out.println("book dao save ...");
    }

    @Override
    public void update() {
        System.out.println("book dao update...");
    }

    @Override
    public int select() {
        System.out.println("book dao select...");
//        int i=1/0;
        return 100;
    }
}
