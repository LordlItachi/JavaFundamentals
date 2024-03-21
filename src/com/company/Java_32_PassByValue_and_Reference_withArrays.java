package com.company;

public class Java_32_PassByValue_and_Reference_withArrays {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};

        // Passing the array by value
        passArrayByValue(myArray);
        System.out.println("After passing by value: " + arrayToString(myArray));

        // Passing the array by reference
        passArrayByReference(myArray);
        System.out.println("After passing by reference: " + arrayToString(myArray));
    }

    public static void passArrayByValue(int[] arr) {
        // Modifying the array within the method
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        System.out.println("Inside passArrayByValue: " + arrayToString(arr));
    }

    public static void passArrayByReference(int[] arr) {
        // Creating a new array and assigning it to the parameter
        arr = new int[] {10, 20, 30, 40, 50};
        System.out.println("Inside passArrayByReference: " + arrayToString(arr));
    }

    public static String arrayToString(int[] arr) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i]);
            if (i < arr.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }

}
