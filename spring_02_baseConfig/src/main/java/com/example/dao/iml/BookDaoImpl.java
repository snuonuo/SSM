package com.example.dao.iml;

import com.example.dao.BookDao;

/**
 * ClassName: BookDaoIml
 * Description:
 *
 * @Author snuonuo
 * @Create 2023/11/30 14:08
 * @Version 1.0
 */
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
