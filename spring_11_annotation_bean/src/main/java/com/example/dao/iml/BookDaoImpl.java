package com.example.dao.iml;

import com.example.dao.BookDao;
import org.springframework.stereotype.Component;

/**
 * ClassName: BookDaoIml
 * Description:
 *
 * @Author snuonuo
 * @Create 2023/11/30 14:08
 * @Version 1.0
 */
@Component("bookDao")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
