package me.lbing.collection;


import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by king on 16/5/15.
 */
public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<String>();
        Collections.addAll(sortedSet,"one two three four five six seven eight".split(" "));
        System.out.println(sortedSet);
        String low = sortedSet.first();
        String high = sortedSet.last();
        System.out.println(low);
        System.out.println(high);
        System.out.println(sortedSet.subSet(low,high));
        System.out.println(sortedSet.headSet(high));
        System.out.println(sortedSet.tailSet(low));

    }
}
