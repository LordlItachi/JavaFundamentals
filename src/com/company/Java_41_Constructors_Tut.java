package com.company;

class MyEmployee {
    private int id ;
    private String name ;
    public MyEmployee(){
        this.id=100;
        this.name="Name-here";
    }

    public MyEmployee(int id, String name){
        this.id=id;
        this.name=name;
    }

    public int getId(){return id;}
    public String getName(){return name;}
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void getDetails(){

        String temp = name;
        char [] arr = temp.toCharArray();
        StringBuilder st = new StringBuilder();
        for(char ch : arr){
            if (ch >= 'A' && ch <= 'Z'){
                st.append(" ");
                st.append(ch);
            }else if (ch >= 'a' && ch <= 'z'){
                st.append(ch);
            }
        }
        System.out.println("The Id is : "+ getId());
        System.out.println("and the name is : "+ st.toString());
    }


}
public class Java_41_Constructors_Tut {
    /* constructors are member function used to initialize an object while creating it .
       It is automatically invoked, and it gives the class variable the default values.
     */
    public static void main(String[] args) {
        MyEmployee prithviRajChauhan= new MyEmployee(1,"prithviRajChauhan");
        prithviRajChauhan.getDetails();


    }
}
