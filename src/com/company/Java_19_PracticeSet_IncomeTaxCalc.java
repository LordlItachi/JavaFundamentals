package com.company;

import java.util.Scanner;

public class Java_19_PracticeSet_IncomeTaxCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float income , tax = 0;
        System.out.println("Enter Your salary In Lakhs (eg: 5.1 that is 5 lakh 10 thousand) : ");
        income = sc.nextFloat();
        // temp variable carrying the income , it is just an extra variable
        float inc = income;
        if (inc<=2.5){
            tax=tax+0;
        } else if (inc>2.5 && inc<5.0) {
            tax += 0.05*(inc-2.5f);
        } else if (inc > 5.0 && inc<= 10.0) {
            tax += (0.05*2.5) + (0.2*(inc-5.0f));
        } else tax += (0.05*2.5) + (0.2*5.0) + 0.3*(inc-10.0f);

        System.out.println("The Total amount of tax you have to pay based on your salary is : "+ tax +" Lakhs");
    }
}
