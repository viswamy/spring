package com.vswamy.spring.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class QuestionAnswer
{
    public static void main(String[] args)
    {   
        ApplicationContext context = new FileSystemXmlApplicationContext("QuestionAnswer.xml");
        Question q = (Question) context.getBean("q");
        q.displayInfo();
    }
}
