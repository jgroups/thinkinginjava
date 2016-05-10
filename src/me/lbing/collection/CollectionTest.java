package me.lbing.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionTest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(16,17,18,19,20);
		list.set(0, 100);
		list.add(88);
	}
}
