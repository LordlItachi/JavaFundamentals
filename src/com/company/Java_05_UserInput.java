package com.company;
import java.util.Scanner;

public class Java_05_UserInput {
    public static void main(String[] args) {
        System.out.println("Yay the shortcut works !!! ");
        // sys.in is to specify read from the keyboard
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        System.out.println("The sum of the entered number is : ");
        System.out.println(a+b);


        System.out.println("Type anything and i will tell u if its a integer or not : ");
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

        // any nextWhatever takes what it needs in this case integer and doesn't take/clear the newline character
        // so now buffer contains the newline character and the scanner.nextLine function takes the newline character
        // as an input instead of taking input from the user . to solve this we can use parse method of parsing int
        // from the buffer as Integer.parseInt(sc.nextInt) so the new line also gets taken , or we can just put one
        // more sc.nextLine in between sc.nextWhatever and sc.nextLine to take the newline char but its a bad practice

        sc.nextLine();
        System.out.println(" type something my boy  :");
        String str = sc.nextLine();
        String str2 = " success !!!  "+ str;
        System.out.println(str2);



    }
}
