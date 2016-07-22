package me.lbing.mytest.concurrency;

/**
 * Created by King on 2016/7/22.
 */

public class NumberRange {
    private int lower, upper;

    public int getLower() { return lower; }
    public int getUpper() { return upper; }

    public void setLower(int value) {
        if (value > upper)
            throw new IllegalArgumentException("");
        lower = value;
    }

    public void setUpper(int value) {
        if (value < lower)
            throw new IllegalArgumentException("");
        upper = value;
    }
}
