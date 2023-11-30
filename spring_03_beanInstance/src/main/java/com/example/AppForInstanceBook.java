package com.example;

import com.example.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceBook {
    public static void main(String[] args) {

        /*
         * 实例化bean方式一：
         * 调用无参构造期（默认有或者自己写），如果没有无参构造器就会报BeanCreationException异常
         *
         */

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookDao bookDao = (BookDao) ctx.getBean("bookDao");

        bookDao.save();

    }
}
