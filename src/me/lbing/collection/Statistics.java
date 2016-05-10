package me.lbing.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {
	public static void main(String[] args) {
		Random rand = new Random(37);
		Map<Integer, Integer> m = new HashMap<>();
		for (int i = 0; i < 10000; i++) {
			int r = rand.nextInt(19);
			Integer freq = m.get(r);
			m.put(r, freq == null ? 1 : freq + 1);
//			if (freq == null) {
//				m.put(r, 1);
//			} else {
//				freq++;
//			}
		}
		System.out.println(m);
	}
}
