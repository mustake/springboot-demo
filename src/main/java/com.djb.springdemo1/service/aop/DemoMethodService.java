package com.djb.springdemo1.service.aop;

import org.springframework.stereotype.Service;

/**
 * 使用方法规则被拦截的类
 */
@Service
public class DemoMethodService {
    public void add(){
        System.out.println("类名"+this.getClass().getName());
    }
}
