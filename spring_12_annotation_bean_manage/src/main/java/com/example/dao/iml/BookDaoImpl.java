package com.example.dao.iml;

import com.example.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

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
@Component
@Scope("singleton")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
    @PostConstruct
    public void init() {
        System.out.println("book dao init ...");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("book dao destroy ...");
    }
}
