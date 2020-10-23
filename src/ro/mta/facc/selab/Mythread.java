package ro.mta.facc.selab;

public class Mythread extends Thread{
    @Override
    public void run() {
        System.out.println("myhtread: Se exec pe alt thread!");
    }
}
