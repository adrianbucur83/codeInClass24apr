package org.example.countingThread;

public class Main {
    public static void main(String[] args) {
        CountingThread thread1 = new CountingThread("Thread 1", 1, 100, 2);
        CountingThread thread2 = new CountingThread("Thread 2", 1, 100, 3);
        CountingThread thread3 = new CountingThread("Thread 3", 1, 100, 5);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}