package com.company;

class MyThreadRunnable implements Runnable{
    @Override
    public void run() {
        int i =0;
        while (i<100) {
            System.out.println("I m thread 1 !! ");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    @Override
    public void run() {
        int i =0;
        while (i<100) {
            System.out.println("I m thread 2 !! ");
            i++;
        }
    }
}

public class Java_71_RunnableInterface_Multithreading {
    public static void main(String[] args) {
        MyThreadRunnable t1 = new MyThreadRunnable();
        Thread thread1 = new Thread(t1);
        MyThreadRunnable2 t2 = new MyThreadRunnable2();
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();

    }
}
