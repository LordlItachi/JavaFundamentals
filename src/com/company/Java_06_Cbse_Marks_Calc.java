package com.company;

import java.util.Scanner;

public class Java_06_Cbse_Marks_Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks of Subject 1: ");
        float sub1 = sc.nextFloat();
        System.out.println("Enter Marks of Subject 2: ");
        float sub2 = sc.nextFloat();
        System.out.println("Enter Marks of Subject 3: ");
        float sub3 = sc.nextFloat();
        System.out.println("Enter Marks of Subject 4: ");
        float sub4 = sc.nextFloat();
        System.out.println("Enter Marks of Subject 5: ");
        float sub5 = sc.nextFloat();

        float total_mark = sub1 + sub2 + sub3 + sub4 + sub5;
        float percentage = total_mark/5;
        System.out.printf(" Your percentage is : %.2f ",percentage);

    }
}
