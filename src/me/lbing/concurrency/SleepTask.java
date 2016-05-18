package me.lbing.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by King on 2016/5/18.
 */
public class SleepTask extends LiftOff {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            service.execute(new SleepTask());
        }
        service.shutdown();
    }
    @Override
    public void run() {
        try {
            while (countDown-- > 0) {
                System.out.println(status());
                //Thread.sleep(100);
                TimeUnit.MILLISECONDS.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
