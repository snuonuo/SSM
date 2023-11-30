package com.example.service.iml;

import com.example.dao.BookDao;
import com.example.dao.iml.BookDaoImpl;
import com.example.service.BookService;

/**
 * ClassName: BookServiceIml
 * Description:
 *
 * @Author snuonuo
 * @Create 2023/11/30 14:10
 * @Version 1.0
 */
public class BookServiceImpl implements BookService {
    // 5. 删除service层中使用new创建的dao对象
    private BookDao bookDao;

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
    //6.提供对应的set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
