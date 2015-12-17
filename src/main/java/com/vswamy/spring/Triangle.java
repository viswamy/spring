package com.vswamy.spring;

public class Triangle
{
    private Point A;
    private Point B;
    private Point C;
    
    Triangle(Point A, Point B, Point C)
    {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    
    public Point getA()
    {
        return A;
    }
 
    public void setA(Point a)
    {
        A = a;
    }

    public Point getB()
    {
        return B;
    }

    public void setB(Point b)
    {
        B = b;
    }

    public Point getC()
    {
        return C;
    }

    public void setC(Point c)
    {
        C = c;
    }

    public void draw()
    {
        System.out.println("Point A = " + A.toString());
        System.out.println("Point B = " + B.toString());
        System.out.println("Point C = " + C.toString());
    }
}
