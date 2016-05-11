package me.lbing.generic;

/**
 * Created by King on 2016/5/11.
 */
public class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Holder3<String> h = new Holder3("");
        String a = h.getA();
        System.out.println(a);
    }
}
