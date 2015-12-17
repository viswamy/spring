package com.vswamy.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DrawingApplication
{
    public static void main(String[] args)
    {   
        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        ApplicationContext context = new FileSystemXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) context.getBean("triangle");
        triangle.draw();
    }
}
