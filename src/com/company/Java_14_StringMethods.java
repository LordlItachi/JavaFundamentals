package com.company;

public class Java_14_StringMethods {
    public static void main(String[] args) {

        String str = "Andrew Cuomo ";
        System.out.println("Original string -> "+ str);

        int len_of_str = str.length();
        String str_in_upper = str.toUpperCase();
        String str_in_lower = str.toLowerCase();
        String trimmed_str = str.trim();
        String substring_of_str = str.substring(1);
        String newstr = str.replace("drew","pew-pew");
        char CharOfStr = str.charAt(2);
        int idxOfSubstring = str.indexOf("ew");
        String str2 = "Andrew Cuomo ";
        boolean sameOrNot = str.equals(str2);
        
        System.out.printf(" String in lowercase : " + str_in_lower
                        + "\n string in uppercase :  " + str_in_upper
                        + "\n Length of string :" +len_of_str
                        + "\n Trimmed String : "+ trimmed_str
                        + "\n A substring at idx 1 in string :  " + substring_of_str
                        + "\n String after replacing drew with pew : " + newstr
                        + "\n Character at pos 2 in string : " + CharOfStr
                        + "\n idx of ew : " + idxOfSubstring
                        + "\n Check if str2 equals to str or not : "+ sameOrNot
                        );
        

    }
}
