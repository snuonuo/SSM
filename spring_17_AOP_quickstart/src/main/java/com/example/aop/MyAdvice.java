package com.example.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * ClassName: MyAdvice
 * Description:
 *
 * @Author snuonuo
 * @Create 2023/12/9 13:49
 * @Version 1.0
 */

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.example.dao.BookDao.update())")
    private void renyiname(){}

    @Before("renyiname()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }

}
