package me.lbing.mytest.concurrency;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by King on 2016/7/22.
 */
public class TestTimer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("abc");
            }
        },3000);
        System.out.println("main end");
    }
}
