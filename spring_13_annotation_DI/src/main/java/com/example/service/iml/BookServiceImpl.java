package com.example.service.iml;

import com.example.dao.BookDao;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * ClassName: BookServiceIml
 * Description:
 *
 * @Author snuonuo
 * @Create 2023/11/30 14:10
 * @Version 1.0
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    @Qualifier("bookDao1")
    // 有相同类型的bean就使用上面两句 指定名称
    private BookDao bookDao;
    // 写Autowired不用写setter方法了
//    public void setBookDao(BookDao bookDao) {
//        this.bookDao = bookDao;
//    }
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }

}
