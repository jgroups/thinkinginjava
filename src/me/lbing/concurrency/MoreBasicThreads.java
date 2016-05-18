package me.lbing.concurrency;

/**
 * Created by King on 2016/5/18.
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new LiftOff()).start();
        }
        System.out.println("waiting for liftoff....");
    }
}
