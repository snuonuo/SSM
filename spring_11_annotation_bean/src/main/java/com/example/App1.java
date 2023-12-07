package com.example;

import com.example.dao.BookDao;
import com.example.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: ${NAME}
 * Description:
 *
 * @Author snuonuo
 * @Create ${DATE} ${TIME}
 * @Version 1.0
 */
public class App1 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);
        BookService bookService = (BookService) ctx.getBean(BookService.class);
        System.out.println(bookService);
    }
}