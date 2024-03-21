package com.company;

public class Java_25_PracticeSet_Loops_Q1 {
    public static void printStars(int n){
        for(int i = n ; i>0; i--){
            for (int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printEvenSum(int n){
        int sum=0, i=0;

        while (i<n){
            sum += 2*i;
            i++;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
//        printStars(6);
        printEvenSum(2);
    }
}
