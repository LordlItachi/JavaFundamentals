package com.company;
import java.util.random.RandomGenerator;
public class Java_32_MethodOverloading {
     static int returnSum(){
         System.out.println("Its obv method 1 dum dum");
         return RandomGenerator.getDefault().nextInt(1,100);
     }
     static int returnSum(int a,int ...arr){
         int sum = a;
         for (int element :arr){
             sum += element;
         }
         System.out.println("Its method 2 var args here");
         return sum;
     }
     static int returnSum(int a ,int b){
         System.out.println("its method 3");
         return a+b;
     }

    public static void main(String[] args) {
        System.out.println(returnSum());
        System.out.println(returnSum(3,4,4,2,2,4,4,42,2,4,5,4,32,2,34,5,53,4342,2,3,4));
        System.out.println(returnSum(3,45));
        System.out.println(returnSum(43));
    }
}
