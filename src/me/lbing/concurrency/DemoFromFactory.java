package me.lbing.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by King on 2016/5/18.
 */
public class DemoFromFactory implements Runnable {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool(new DeamThreadFactory());
        for (int i = 0; i < 10; i++) {
            service.execute(new DemoFromFactory());
        }
        System.out.println("all demon thread started");
        service.shutdown();
        Thread.sleep(200);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread()+" "+this);
    }
}
