package com.vswamy.spring;

public class Triangle
{
    private String type;
    
    Triangle(String type)
    {
        this.type = type;
    }
    
    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void draw()
    {
        System.out.println("Triangle draw method! = " + this.getType());
    }
}
