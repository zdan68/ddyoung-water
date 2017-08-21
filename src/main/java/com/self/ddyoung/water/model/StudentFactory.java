package com.self.ddyoung.water.model;

import org.springframework.beans.factory.InitializingBean;

/**
 * Created by sanbian on 2017/8/21.
 */
public class StudentFactory implements InitializingBean {
    public void afterPropertiesSet() throws Exception {
        System.out.println("student class initialized.");
    }
}
