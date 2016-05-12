package me.lbing.array;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by King on 2016/5/12.
 */
public class IceCream {
    public static Random rand = new Random(47);
    static final String[] FLAVORS = {"Chocolate", "StrawBerry", "Chocolate1", "Chocolate2", "Chocolate3", "Chocolate4"};

    public static String[] flavorSet(int n) {
        if (n > FLAVORS.length) {
            throw new IllegalArgumentException("Set too long");
        }
        String[] result = new String[n];
        boolean[] picked = new boolean[FLAVORS.length];
        for (int i = 0; i < n; i++) {
            int t;
            do {
                t = rand.nextInt(FLAVORS.length);
            } while (picked[t]);
            result[i] = FLAVORS[t];
            picked[t] = true;
        }
        return result;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.println(Arrays.toString(flavorSet(3)));
        }
    }
}
