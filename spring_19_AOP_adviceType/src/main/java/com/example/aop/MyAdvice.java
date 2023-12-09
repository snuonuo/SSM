package com.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * ClassName: MyAdvice
 * Description:
 *
 * @Author snuonuo
 * @Create 2023/12/9 14:30
 * @Version 1.0
 */

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(void com.example.dao.BookDao.update())")
    public void pt(){}

    @Pointcut("execution(int com.example.dao.BookDao.select())")
    public void pt2(){}

//    @Before("pt()")
    public void before(){
        System.out.println("before advice...");
    }

//    @After("pt()")
    public void after(){
        System.out.println("after advice...");
    }

    @Around("pt()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("before advice...");
        // 表示对原始操作的调用
        pjp.proceed();
        System.out.println("after advice...");
    }

    @Around("pt2()")
    public Object aroundSelect(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("before advice...");
        // 把返回值接出来
        Object ret=pjp.proceed();
        System.out.println("after advice...");
        return ret;
    }

    @AfterReturning("pt2()")
    public void afterReturn(){
        System.out.println("afterReturn advice...");
    }

    @AfterThrowing("pt2()")
    public void afterThrow(){
        System.out.println("afterThrow advice...");
    }
}




