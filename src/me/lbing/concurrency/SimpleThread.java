package me.lbing.concurrency;

/**
 * Created by King on 2016/5/18.
 */
public class SimpleThread extends Thread {
    private static int threadCount = 0;

    public SimpleThread() {
        super(++threadCount + "");
        start();
    }

    @Override
    public void run() {
        super.run();
    }
}
