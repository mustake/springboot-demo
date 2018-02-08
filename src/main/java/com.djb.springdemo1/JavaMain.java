package com.djb.springdemo1;

import com.djb.springdemo1.config.JavaConfig;
import com.djb.springdemo1.service.javabean.JUseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        JUseFunctionService jUseFunctionService=context.getBean(JUseFunctionService.class);
        System.out.println(jUseFunctionService.sayWorld("javaconfig"));
        context.close();
    }


}
