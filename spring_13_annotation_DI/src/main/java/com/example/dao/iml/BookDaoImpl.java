package com.example.dao.iml;

import com.example.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * ClassName: BookDaoIml
 * Description:
 *
 * @Author snuonuo
 * @Create 2023/11/30 14:08
 * @Version 1.0
 */
@Repository("bookDao1")
public class BookDaoImpl implements BookDao {
    @Value("${name}")
    private String name;
    @Override
    public void save() {
        System.out.println("book dao save ..."+name);
    }
//    @PostConstruct
//    public void init() {
//        System.out.println("book dao init ...");
//    }
//    @PreDestroy
//    public void destroy() {
//        System.out.println("book dao destroy ...");
//    }
}
