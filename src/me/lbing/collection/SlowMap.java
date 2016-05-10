package me.lbing.collection;

import java.util.*;

/**
 * Created by King on 2016/5/10.
 */
public class SlowMap<K, V> extends AbstractMap<K, V> {

    public static void main(String[] args) {

    }



    private List<K> keys = new ArrayList<>();
    private List<V> values = new ArrayList<>();

    @Override
    public V put(K key, V value) {
        V oldValue = get(key);
        if (!keys.contains(key)) {
            keys.add(key);
            values.add(value);
        } else {
            values.set(keys.indexOf(key), value);
        }
        return oldValue;
    }

    @Override
    public V get(Object key) {
        if (!keys.contains(key)) {
            return null;
        }
        return values.get(keys.indexOf(key));
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = new HashSet<>();
        Iterator<K> ki = keys.iterator();
        Iterator<V> vi = values.iterator();
        while (ki.hasNext()) {
            set.add(new MapEntry<K, V>(ki.next(), vi.next()));
        }
        return set;
    }
}

class MapEntry<K, V> implements Map.Entry<K, V> {
    private K k;
    private V v;

    public MapEntry(K k, V v) {
        this.k = k;
        this.v = v;
    }

    @Override
    public K getKey() {
        return k;
    }

    @Override
    public V getValue() {
        return v;
    }

    @Override
    public V setValue(V value) {
        V resut = value;
        this.v = value;
        return resut;
    }

    @Override
    public int hashCode() {
        return (k == null ? 0 : k.hashCode()) ^ (v == null ? 0 : v.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MapEntry<?, ?> mapEntry = (MapEntry<?, ?>) o;

        if (k != null ? !k.equals(mapEntry.k) : mapEntry.k != null) return false;
        return !(v != null ? !v.equals(mapEntry.v) : mapEntry.v != null);

    }

    @Override
    public String toString() {
        return k + "=" + v;
    }
}
