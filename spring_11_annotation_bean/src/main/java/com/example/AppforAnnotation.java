package com.example;

import com.example.config.SpringConfig;
import com.example.dao.BookDao;
import com.example.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName: AppforAnnotation
 * Description:
 *
 * @Author snuonuo
 * @Create 2023/12/7 15:05
 * @Version 1.0
 */
public class AppforAnnotation {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);
        BookService bookService = (BookService) ctx.getBean(BookService.class);
        System.out.println(bookService);
    }

}
