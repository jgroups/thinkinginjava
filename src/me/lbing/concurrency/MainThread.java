package me.lbing.concurrency;

/**
 * Created by King on 2016/5/18.
 */
public class MainThread {
    public static void main(String[] args) {
        LiftOff launch = new LiftOff(15);
        launch.run();
    }
}
