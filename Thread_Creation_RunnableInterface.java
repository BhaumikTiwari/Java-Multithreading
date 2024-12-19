package Multithreading;

public class Thread_Creation_RunnableInterface implements Runnable {
    @Override
    public void run() {
        for (; ; ) {
            System.out.println(Thread.currentThread().getName());
        }

    }
}
