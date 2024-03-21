package com.company;

public class Java_12_PracticeSet_Q1 {
    public static String encrypt(String Message){
        String[] str = new String[Message.length()];
        for (int i=0; i<Message.length();i++){
            str[i] = Character.toString(Message.charAt(i)+8);
        }
        StringBuilder secret = new StringBuilder();
        for (String s : str) {
            secret.append(s);
        }
        return secret.toString();
    }
    public static String decrypt(String secret){
        String[] message = new String[secret.length()];
        for (int i=0;i<secret.length();i++){
            message[i] = Character.toString(secret.charAt(i)-8);
        }
        StringBuilder ans = new StringBuilder();
        for (String s : message){
            ans.append(s);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String Message1="aaaaaaa";
        String test = encrypt(Message1);
        System.out.println(test);
        String test2 = decrypt(test);
        System.out.println(test2);
        
    }
}
