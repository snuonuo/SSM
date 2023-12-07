package com.example;

import com.example.config.SpringConfig;
import com.example.dao.BookDao;
import com.example.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


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
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = ctx.getBean(BookService.class);
        bookService.save();
    }
}