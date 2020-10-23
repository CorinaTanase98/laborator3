package Ex2;


import ro.mta.facc.selab.Mythread;

public class Main {

    public static void main(String[] args) {

        Thread thread = Thread.currentThread();
        String threadName = Thread.currentThread().getName();

        System.out.println("main thread name:  " + threadName);

        int i;
        for(  i=0;i<=9;i++)
        {
            MyThread t = new MyThread();
            t.setName(String.format("thread" + i));
            t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


}
