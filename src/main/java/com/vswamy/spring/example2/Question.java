package com.vswamy.spring.example2;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Question
{
    private int id;
    private String question;
    private List<String> answers;

    public Question()
    {

    }

    public Question(int id, String question, List<String> answers)
    {
        this.id = id;
        this.question = question;
        this.answers = answers;
    }

    public void displayInfo()
    {
        System.out.println(id + " " + this.question);
        System.out.println("answers are:");
        Iterator<String> itr = answers.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
