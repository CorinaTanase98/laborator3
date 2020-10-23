package ro.mta.facc.selab;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("runnable: Se exec pe alt thread!");
    }
}
