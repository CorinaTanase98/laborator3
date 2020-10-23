package ro.mta.facc.selab;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
          Carte c = new Carte("tr", 1999,600,"sdfgh");
        System.out.println( c);

        Biblioteca b=new Biblioteca();
        b.add(c);
        b.add(new Carte("Carte1", 1999, 500, "sdfgh"));
        b.add(new Carte("Carte2", 1399, 200, "sdfgh"));
        b.add(new Carte("Carte221", 1999, 500, "sdfgh"));
        b.sort();
        System.out.println( b);



    /*

        ArrayList<Task> tasks = new ArrayList<Task>();
        tasks.add(new OutTask("mesaj1\n"));
        tasks.add(new OutTask("mesaj2\n"));
        tasks.add(new RandomOutTask());
        tasks.add(new CounterOutTask());


        for(Task j:tasks)
            j.execute(); */

        /*Mythread t = new Mythread();
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("altul");
            }
        }).start();

        MyRunnable run= new MyRunnable();
        Thread t3= new Thread(run);
        t3.start(); */


    }
}
