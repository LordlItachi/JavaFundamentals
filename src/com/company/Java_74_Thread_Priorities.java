package com.company;
/* Thread Priorities are just suggestions to CPU , they are not concrete ,
if u want to enforce them so much then maybe you don't need threads .
still you can make them concurrent using : Concurrency Mechanism such as CountDownLatch
also you can use ExecutorService or ForkJoinPool
 */
class T1 extends Thread{
    public T1(String threadName){
        super(threadName);
    }
    @Override
    public void run() {
        int i=0;
        while (i<100) {
            System.out.println("Running Thread" + this.getName() + " !!!");
            i++;
        }
    }
}
public class Java_74_Thread_Priorities {
    public static void main(String[] args) {

        T1 t1 = new T1("t1");
        T1 t2 = new T1("t2");
        T1 t3 = new T1("t3");
        T1 t4 = new T1("t4");
        T1 t5 = new T1("t5");
        t5.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

}
