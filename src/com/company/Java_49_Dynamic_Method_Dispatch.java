package com.company;

class Robot{
    private int task;
    public void takeInput(int task){
        this.task=task;
        System.out.println("Currently doing task no. : "+ task);
    }
    public void processing(int task){
        this.task=task;
        System.out.println("I am robot, and am Processing !!!! task :"+this.task);
    }
    public String takeOutput(){
        System.out.println("I did the fking thing Master!!! ");
        return "Task Complete";
    }
}
class Humanoid extends Robot{
    int work;
    public void takeInput(int task){
        this.work=task;
        System.out.println("I m currently Thinking how to do the task :"+task+" efficiently");
    }

    @Override
    public void processing(int work) {
        this.work=work;
        super.processing(work);
        System.out.println("I m Human and am analyzing task : "+this.work);

    }
    public void communication(String name){
        System.out.println("Hello "+ name + "!!! How was your Day");
    }
}

public class Java_49_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        System.out.println("\n CASE 1 Just a Class , subclassed by some class: \n");
        Robot neo = new Robot();
        neo.takeInput(1);

        System.out.println("\n CASE 2 inheritance , sub from super : \n");
        Humanoid alex = new Humanoid();
        alex.processing(23);
        
        System.out.println("\n CASE 3 Dynamic Method Dispatch [Super refers sub object]  : \n");
        Robot doraemon = new Humanoid();
        doraemon.processing(23);
        doraemon.takeInput(2);


    }
}
