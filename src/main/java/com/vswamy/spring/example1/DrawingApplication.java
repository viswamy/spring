package com.vswamy.spring.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DrawingApplication
{
    public static void main(String[] args)
    {   
        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        ApplicationContext context = new FileSystemXmlApplicationContext("DrawingApplication.xml");
        Triangle triangle = (Triangle) context.getBean("triangle");
        triangle.draw();
    }
}
