package com.example.dao.iml;

import com.example.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * ClassName: BookDaoIml
 * Description:
 *
 * @Author snuonuo
 * @Create 2023/11/30 14:08
 * @Version 1.0
 */
@Repository("bookDao2")
public class BookDaoImpl2 implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao 2222 save ...");
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
