package com.example;

import com.example.config.SpringConfig;
import com.example.dao.BookDao;
import com.example.dao.impl.BookDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName: ${NAME}
 * Description:
 *
 * @Author snuonuo
 * @Create ${DATE} ${TIME}
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        bookDao.update();
    }
}