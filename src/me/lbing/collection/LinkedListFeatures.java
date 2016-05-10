package me.lbing.collection;

import java.util.LinkedList;
import java.util.Stack;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;
import typeinfo.pets.Rat;

public class LinkedListFeatures {
	public static void main(String[] args) {
		LinkedList<Pet> pets = new LinkedList<Pet>(Pets.arrayList(5));
		System.out.println(pets);

		System.out.println("pets.getFirst():" + pets.getFirst());
		System.out.println(pets.element());
		pets.peek();
		pets.offer(new Rat());
		Stack<Pet> stack = new Stack<>();
	}
}
