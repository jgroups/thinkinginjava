package me.lbing.collection;

import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.Set;

/**
 * Created by King on 2016/5/10.
 */
public class SimpleHashMap<K, V> extends AbstractMap<K, V> {
    static final int SIZE = 997;
    LinkedList<MapEntry<K, V>>[] buckets = new LinkedList[SIZE];

    @Override
    public V put(K key, V value) {
        V oldValue = null;
        int index = Math.abs(key.hashCode()) % SIZE;
        if(buckets[index] == null){
            buckets[index] = new LinkedList<>();
        }
        LinkedList<MapEntry<K, V>> bucket = buckets[index];

        return super.put(key, value);
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
