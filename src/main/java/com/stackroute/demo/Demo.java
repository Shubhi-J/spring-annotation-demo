package com.stackroute.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

    public static void main(String[] args) {

        // Create object of BeanLifeCycleDemoBean class
        BeanLifecycleDemoBean beanLifecycleDemoBean;

        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);

        // get the object of BeanLifeCycleDemoBean from bean
        beanLifecycleDemoBean = context.getBean("beanLifecycleDemoBean",BeanLifecycleDemoBean.class);

        ((ConfigurableApplicationContext)context).close();
       
   }
}
