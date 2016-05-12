package me.lbing.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by King on 2016/5/12.
 */
public class ArrayOfGenerics {
    public static void main(String[] args) {
        List<String>[] ls;
        List[] la = new List[20];
        ls = (List<String>[])la;
        ls[0] = new ArrayList<String>();


    }
}
