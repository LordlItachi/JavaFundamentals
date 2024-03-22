package com.company;
class Circle{
    float pi = (float)Math.PI;
    float radius;
    Circle(float radius){
        this.radius=radius;
    }
    public float getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    private float perimeter(){
        return 2*pi*radius;
    }
    public float area(){
        return pi*radius*radius;
    }
}
class Cylinder extends Circle{
    float height ;
    Cylinder(float radius , float height){
        super(radius);
        this.height=height;
    }
    public float surfaceArea(){
        return 2*((pi*radius*height)+(pi*radius*radius));
    }
    public float volume(){
        return pi*radius*radius*height;
    }
}
public class Java_52_Inheritance_PracticeSet {
    public static void main(String[] args) {
        Circle circle = new Circle(23);
        System.out.println("The area of Circle is : "+ circle.area()+" square metre");
        System.out.println("Here starts the code for Cylinder");
        Cylinder cylinder = new Cylinder(23,10);
        System.out.println("The surface area of Cylinder is : "+ cylinder.surfaceArea()+" square metre");
        System.out.println("The volume of the Cylinder is : "+ cylinder.volume()+" cubic metre");
    }
}
