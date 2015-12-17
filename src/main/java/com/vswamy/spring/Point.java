package com.vswamy.spring;

public class Point
{
    int x;
    int y;
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public int getX()
    {
        return x;
    }
    
    public void setX(int x)
    {
        this.x = x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public void setY(int y)
    {
        this.y = y;
    }
    
    public String toString()
    {
        return String.format("x: %1d, y:%2d", this.x, this.y);
    }
    
}
