package com.codegym.ss8.util.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BookEspect {
//    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @After("execution(* com.codegym.ss8.controller.BookController.*(..))")
    public void logAfterMethodController(JoinPoint joinPoint) {
        String nameMethod = joinPoint.getSignature().getName();
        System.out.println("method được gọi :" + nameMethod);
    }
    int visit = 0;
    @Pointcut(value = "within(com.codegym.ss8.controller.*)")
    public void executeController(){}

    @Before(value = "executeController()")
    public void beforeExecuteController(){
        System.out.println("so lan truy cập : " + ++visit );
    }
}
