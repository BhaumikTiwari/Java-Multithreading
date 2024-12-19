package Multithreading;

public class Test {
    public static void main(String[] args) {
        Thread_Creation_RunnableInterface thread = new Thread_Creation_RunnableInterface();
        Thread t1 = new Thread(thread);
        t1.start();

        for(; ; ){
            System.out.println(Thread.currentThread().getName());
        }

    }
}
