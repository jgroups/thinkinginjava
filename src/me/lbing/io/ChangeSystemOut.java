package me.lbing.io;

import java.io.PrintWriter;

/**
 * Created by King on 2016/5/17.
 */
public class ChangeSystemOut {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("hello word");
        pw.close();
    }
}
