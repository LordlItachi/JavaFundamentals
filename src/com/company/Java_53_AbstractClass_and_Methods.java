package com.company;

abstract class Shape{
    public abstract void area();
    public abstract void volume();
}
class Circle1 extends Shape{
    int radius;
    Circle1(int radius){
        this.radius=radius;
        System.out.println("The radius is set by the constructor of Circle1 Class");
    }
    public void area(){
        float pi= (float)Math.PI;
        float ans = pi*radius*radius;
        System.out.println("The area of this Circle is : "+ans+" metre square");
    }
    public void volume(){
        System.out.println("there is no volume in a 2D shape");
    }
}


public class Java_53_AbstractClass_and_Methods {
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1(23);
        circle1.area();
        circle1.volume();
    }
}
