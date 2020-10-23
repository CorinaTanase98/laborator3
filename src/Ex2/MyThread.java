package Ex2;

public class MyThread extends Thread{
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);
    }

}
