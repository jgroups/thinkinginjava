package me.lbing.array;

import java.util.Arrays;

/**
 * Created by King on 2016/5/12.
 */
public class ThreeDWithNew {
    public static void main(String[] args) {
        int[][][] a = new int[2][2][2];
        System.out.println(Arrays.deepToString(a));
        System.out.println("---------------------");
        int[] b = new int[3];//必须指定长度
        char[] c = new char[4];
        System.out.println(c[1]);
    }
}
