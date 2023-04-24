package org.example.sumUpNumbers;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        int total = 0;

        for (int i = 0; i < 5; i++) {
            RandomNumberRunnable randomNumberRunnable = new RandomNumberRunnable();
            Thread thread = new Thread(randomNumberRunnable, "Thread  " + String.valueOf(i) + ". ");
            System.out.print("We are in thread " + thread.getName());
            thread.start();
            thread.join();
            total += randomNumberRunnable.getNumber();
        }

        System.out.println("Sum: " + total);
    }
}
