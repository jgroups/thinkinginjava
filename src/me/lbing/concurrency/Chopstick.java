package me.lbing.concurrency;

/**
 * Created by King on 2016/5/23.
 */
public class Chopstick {
    private boolean taken = false;

    public synchronized void take() throws InterruptedException {
        if (taken) {
            wait();
        }
        taken = true;
    }

    public synchronized  void drop(){
        taken = false;
        notifyAll();
    }
}
