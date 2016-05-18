package me.lbing.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by King on 2016/5/17.
 */
public class Echo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null && s.length() != 0) {
            System.out.println(s);
        }
    }
}
