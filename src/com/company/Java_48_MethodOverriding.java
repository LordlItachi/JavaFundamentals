package com.company;
class EkClass{
    int x ;
    EkClass(){
        System.out.println("constructor of EkClass class:)");
    }
    int method1(int a){
        this.x=a;
        System.out.println("this is method 1 of class EkClass");
        return this.x;
    }
}
class DoClass extends EkClass{
    int y ;
    DoClass(){
        System.out.println("Constructor of DoClass class :) ");
    }
    @Override
    int method1(int a){
        this.y=a;
        System.out.println("this is method 1 of class DoClass");
        return this.y;
    }
}
public class Java_48_MethodOverriding {
    public static void main(String[] args) {
        System.out.println("\nCode starts here *** \n");
        EkClass ek = new EkClass();
        System.out.println(ek.method1(23));
        System.out.println("\nThere is a break here **** \n");
        DoClass doo = new DoClass();
        doo.method1(34);



    }
}
