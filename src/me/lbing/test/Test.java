package me.lbing.test;

/**
 * Created by King on 2016/5/10.
 */
public abstract class Test<C> {
    String name;

    public Test(String name) {
        this.name = name;
    }

    abstract int test(C container,TestParam tp);

    public static void main(String[] args) {
        //
        System.out.println("----");
    }
}
