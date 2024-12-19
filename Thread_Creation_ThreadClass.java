package Multithreading;

public class Thread_Creation_ThreadClass extends Thread {
    @Override
    public void run() {
        for(;;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
