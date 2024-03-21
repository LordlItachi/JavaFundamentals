package com.company;

public class Java_35_PracticeSet_FIbonacci {
    static int fiboAt(int n){
        if (n == 1){
            return 0;
        }
        if (n==2){
            return 1;
        }
        else {

            return fiboAt(n-1)+fiboAt(n-2);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(fiboAt(5));
    }
}
