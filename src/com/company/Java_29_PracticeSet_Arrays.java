package com.company;

import java.util.Arrays;

public class Java_29_PracticeSet_Arrays {
    public static void SmallMatrixCalc(){
        int[][] A = { {3, -2, 5}, {3, 0, 4} };
        int[][] B = { {2, 3}, {-9, 0}, {0, 4} };
        if (A.length!=B[0].length){
            System.out.println("Multiplication is not possible due to config : mxn & a&b and a & b should be equal :");
            return;
        }
        int [][] resultant = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                resultant[i][j]=0;
                for (int k = 0; k < A[i].length; k++) {
                    resultant[i][j] += A[i][k]*B[k][j];
                }

            }

        }
        for (int[] row : resultant) {
            for (int elements : row) {
                System.out.print(elements + " ");
            }
            System.out.println();

        }
        return;
    }
    public static String reverseTheString(String Original){

        char [] CharArr = Original.trim().toCharArray();
        int size = CharArr.length;
        for (char s: CharArr) {
        }
        
        for(int i=0,j=size-1 ; i<(size/2) && j>(size/2); i++,j--){
            char temp = CharArr[i];
            CharArr[i]=CharArr[j];
            CharArr[j]=temp;
        }
        StringBuilder str= new StringBuilder();
        for (char ch:CharArr){
            str.append(ch);
        }
        return str.toString();
    }
    public static int [] reverseArray(int [] Original){
        int size = Original.length;
        int mid = Math.floorDiv(size,2);
        int temp;
        for (int i=0;i<mid;i++){
            temp=Original[i];
            Original[i]=Original[size-i-1];
            Original[size-i-1]=temp;
        }
        return Original;
    }
    public static void main(String[] args) {
        System.out.println(reverseTheString("Golgoita bkl"));
        int [] arr={1,2,4,5,53};
        arr = reverseArray(arr);
        for (int n : arr){
            System.out.println(n);
        }

    }
}
