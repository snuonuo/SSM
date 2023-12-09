package com.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * ClassName: ProjectAdvice
 * Description:
 *
 * @Author snuonuo
 * @Create 2023/12/9 15:16
 * @Version 1.0
 */
@Component
@Aspect
public class ProjectAdvice {

    @Pointcut("execution(* com.example.service.*Service.*(..))")
    public void servicePt(){}

    @Around("servicePt()")
    public void runSpeed(ProceedingJoinPoint pjp) throws Throwable {
        Signature signature=pjp.getSignature();
        String classname = signature.getDeclaringTypeName();
        String methodname = signature.getName();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            pjp.proceed();
        }
        long end = System.currentTimeMillis();
        System.out.println("业务层接口万次执行 "+classname+"."+methodname+" 时间: "+(end-start)+"ms");
    }
}
