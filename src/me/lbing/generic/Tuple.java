package me.lbing.generic;

/**
 * Created by King on 2016/5/11.
 */
public class Tuple<A, B> {
    private A first;
    private B second;

    public Tuple(A first, B second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "( " + first + "," + second + ")";
    }
}
