package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    // this method will be called just after the initialization of bean
    @PostConstruct
    private void init() {
        System.out.println("Verifying Resources");
    }

    // this method will be called just before destroying bean
    @PreDestroy
    private void shutdown() {
        System.out.println("Shutdown All Resources");
    }

    // override methods of interfaces implemented
    @Override
    public void destroy() throws Exception {
    System.out.println("just before destroying bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("just after property set");
    }
}
