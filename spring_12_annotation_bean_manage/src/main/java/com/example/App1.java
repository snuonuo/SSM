package com.example;

import com.example.config.SpringConfig;
import com.example.dao.BookDao;

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
        BookDao bookDao1 = ctx.getBean(BookDao.class);
        System.out.println(bookDao1);
        BookDao bookDao2 = ctx.getBean(BookDao.class);
        System.out.println(bookDao2);
        ctx.close();
    }
}