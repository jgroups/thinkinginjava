package me.lbing.collection;

import java.util.LinkedHashMap;

/**
 * Created by king on 16/5/15.
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>(16, 0.75f, true);
//        LinkedHashMap<Integer,String> map = new LinkedHashMap<>(16,0.75f,false);
//        LinkedHashMap<Integer,String> map = new LinkedHashMap<>(16);
        map.put(0, "o");
        map.put(4, "d");
        map.put(5, "e");
        map.put(6, "f");
        map.put(7, "g");
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "c");
        System.out.println(map);
        for (int i = 0; i < 5; i++) {
            map.get(i);
        }
        System.out.println(map);
        map.get(3);
        System.out.println(map);
    }
}
