package com.company;

class Base{
    private int x ;
    Base(){
        System.out.println("this is the Constructor of Base");
    }
    Base(int a){
        this.x=a;
        System.out.println("This is the Overloading Constructor of Base with default x value: "+ a);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Subclass extends  Base{
    private int y ;

    Subclass(){
        System.out.println("This is the constructor of Subclass");
    }
    Subclass(int b){
        super(10);
        this.y=b;
        System.out.println("This is the Overloading Constructor of Subclass with default y value : "+b);
    }
    Subclass(int a, int b){
        super(a);
        this.y=b;
        System.out.println("This is the OverOverLoading Constructor of Subclass with default y value : "
                + y +"and x "+ "value passed to parent class Base : "+a);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Java_46_Constructors_in_Inheritance {
    public static void main(String[] args) {
        Base parent = new Base(123);
        System.out.println("break here **** ");
        Subclass child = new Subclass(123,234);
    }

}
