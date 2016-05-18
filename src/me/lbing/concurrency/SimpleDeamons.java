package me.lbing.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Created by King on 2016/5/18.
 */
public class SimpleDeamons implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread deamon = new Thread(new SimpleDeamons());
            deamon.setDaemon(true);//Must call before start
            deamon.start();
        }
        System.out.println("all deamons started");
        TimeUnit.MILLISECONDS.sleep(175);
    }
    @Override
    public void run() {
        try {
            TimeUnit.MILLISECONDS.sleep(100);
            System.out.println(Thread.currentThread() + " " + this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
