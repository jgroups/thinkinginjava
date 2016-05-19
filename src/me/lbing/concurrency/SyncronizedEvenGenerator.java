package me.lbing.concurrency;

/**
 * Created by King on 2016/5/19.
 */
public class SyncronizedEvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;

    @Override
    public synchronized int next() {
        ++currentEvenValue;
        Thread.yield();//cause failed faster,(让出CPU)
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new SyncronizedEvenGenerator());
    }
}
