package org.example;

import org.example.service.BookService;
import org.example.service.iml.BookServiceImpl;

/**
 * ClassName: ${NAME}
 * Description:
 *
 * @Author snuonuo
 * @Create ${DATE} ${TIME}
 * @Version 1.0
 */
public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}