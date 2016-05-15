package me.lbing.array;

/**
 * Created by king on 16/5/11.
 */
public class ArrayOptions {
    public static void main(String[] args) {
        BerylliumSphere[] a = {};
        BerylliumSphere[] b;
        b = new BerylliumSphere[]{};
        char[] c = new char[4];
        System.out.println(c);
        System.out.println(c[0] +c[2]);

    }
}

class BerylliumSphere{
    private static long counter;
    private long id = counter++;

    @Override
    public String toString() {
        return "Sphere : " +id;
    }
}
