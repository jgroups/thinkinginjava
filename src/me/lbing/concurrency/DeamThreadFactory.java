package me.lbing.concurrency;

import java.util.concurrent.ThreadFactory;

/**
 * Created by King on 2016/5/18.
 */
public class DeamThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
