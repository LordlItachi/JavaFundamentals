package com.company;
import java.util.Scanner;
public class Java_19_PracticeSet_switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("All the marks are between range 1-100 \nEnter the Marks of Subject 1 : ");
        int sub1 = sc.nextInt();
        System.out.println("Enter the Marks of Subject 2 : ");
        int sub2 = sc.nextInt();
        System.out.println("Enter the Marks of Subject 3 : ");
        int sub3 = sc.nextInt();
        if (sub1<33 || sub2<33 || sub3<33){
            System.out.println("You didn't manage to Pass :( ");
            return;
        }
        float percentage = (float)(sub1+sub2+sub3)/3.00f;
        if (percentage>= 40){
            System.out.println("You passed !!! \n You Got "+ percentage+ "%");
        }else System.out.println("You didn't Pass :( ");
    }
}
