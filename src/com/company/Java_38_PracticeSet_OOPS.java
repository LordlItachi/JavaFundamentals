package com.company;

class Employee{
    String name;
    int salary;
    public void setName(String newName){
        name = newName;
    }
    public void setSalary(int newSal){
        salary = newSal;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public void getDetails(){
        System.out.println("I am "+ getName());
        System.out.println("and my salary is : "+ getSalary());
    }
}
public class Java_38_PracticeSet_OOPS {
    public static void main(String[] args) {
        Employee nikhil = new Employee();
        nikhil.setName("Nikhil");
        nikhil.salary = 150;
        nikhil.getDetails();

    }
}
