package org.example.sumUpNumbers;


import java.util.Random;

public class RandomNumberRunnable implements Runnable {
    private int number;

    public int getNumber() {
        return number;
    }

    @Override
    public void run() {
        Random random = new Random();
        number = random.nextInt(10) + 1;
        System.out.println("We generated number " + number);
    }
}
