package me.lbing.collection;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by King on 2016/5/7.
 */
public class TypesForSets {

    public static void main(String[] args) {
//        test(new HashSet<HashType>(), HashType.class);
        test(new TreeSet<TreeType>(), TreeType.class);
//        test(new LinkedHashSet<HashType>(), HashType.class);
//        test(new HashSet<SetType>(), SetType.class);
//        test(new HashSet<TreeType>(), TreeType.class);
    }

    static <T> void test(Set<T> set, Class<T> type) {
        fill(set, type);
        fill(set, type);
        fill(set, type);
        System.out.println(set);
    }

    static <T> Set<T> fill(Set<T> set, Class<T> type) {
        for (int i = 0; i < 10; i++) {
            try {
                set.add(type.getConstructor(int.class).newInstance(i));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return set;
    }

}

class SetType {
    int i;

    public SetType(int n) {
        i = n;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof SetType && (i == ((SetType) obj).i);
    }

    @Override
    public String toString() {
        return "SetType:" + Integer.toString(i);
    }
}

class HashType extends SetType {

    public HashType(int n) {
        super(n);
    }

    @Override
    public int hashCode() {
        return i;
    }

    @Override
    public String toString() {
        return "HashType:" + Integer.toString(i);
    }
}

class TreeType extends SetType implements Comparable<TreeType> {

    public TreeType(int n) {
        super(n);
    }

    @Override
    public int compareTo(TreeType o) {
        return o.i < i ? -1 : (o.i == i ? 0 : 1);
    }

    @Override
    public String toString() {
        return "TreeType:" + Integer.toString(i);
    }
}
