package me.lbing.concurrency;

/**
 * Created by King on 2016/5/19.
 */
public abstract class IntGenerator {
    private volatile boolean cancled = false;

    public abstract int next();

    public void cancle() {
        cancled = true;
    }

    public boolean isCancled() {
        return cancled;
    }
}
