package ro.mta.facc.selab;

import java.util.Random;

public class RandomOutTask implements Task {

    @Override
    public void execute() {
        Random rand = new Random(); //instance of random class
        int upperbound = 100;

        int int_random = rand.nextInt(upperbound);
        System.out.println(int_random);
    }
}
