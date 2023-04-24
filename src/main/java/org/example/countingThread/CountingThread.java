package org.example.countingThread;

class CountingThread extends Thread {
    private int start;
    private int end;
    private int step;

    public CountingThread(String name, int start, int end, int step) {
        super(name);
        this.start = start;
        this.end = end;
        this.step = step;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i += step) {
            System.out.println(getName() + ", we are at number: " + i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}