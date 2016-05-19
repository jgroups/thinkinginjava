package me.lbing.concurrency;

/**
 * Created by King on 2016/5/19.
 */
public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;

    public synchronized static int nextSerialNumber() {
        return serialNumber++;//Not Thread safe
    }
}

