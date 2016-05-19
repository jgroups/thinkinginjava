package me.lbing.concurrency;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by King on 2016/5/19.
 */
public class AttemptLocking {
    private ReentrantLock lock = new ReentrantLock();

    public void untimed() {
        boolean captured = lock.tryLock();
        try {
            System.out.println(Thread.currentThread().getName() + " tryLock(): " + captured);
        } finally {
            if (captured) {
                lock.unlock();
            }
        }
    }

    public void timed() {
        boolean captured = false;
        try {
            captured = lock.tryLock(2, TimeUnit.SECONDS);
            System.out.println(Thread.currentThread().getName() + " tryLock(2, TimeUnit.SECONDS): " + captured);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            if (captured) {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        final AttemptLocking al = new AttemptLocking();
        al.untimed();
        al.timed();
        new Thread() {
            {
                setDaemon(true);
            }

            @Override
            public void run() {
                al.lock.lock();
                System.out.println("acquired");
            }
        }.start();
        Thread.yield();//give the 2nd task a change
        al.untimed();
        al.timed();
    }
}
