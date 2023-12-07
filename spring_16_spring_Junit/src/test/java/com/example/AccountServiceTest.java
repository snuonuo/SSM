package com.example;

import com.example.config.SpringConfig;
import com.example.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ClassName: AccountServiceTest
 * Description:
 *
 * @Author snuonuo
 * @Create 2023/12/7 20:20
 * @Version 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testFindById() {
        System.out.println(accountService.findById(1));
    }

    @Test
    public void testFindAll() {
        System.out.println(accountService.findAll());
    }
}
