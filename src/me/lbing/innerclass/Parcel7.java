package me.lbing.innerclass;

public class Parcel7 {
	public Contents contents(int i) {
		return new Contents() {
			private int j = i;

			public int value() {
				return j;
			}
		};
	}

	public static void main(String[] args) {
		Parcel7 p = new Parcel7();
		Contents contents = p.contents(8);
	}
}

class Contents {
	public Contents() {

	}
	// public Contents(int i){
	// System.out.println("base class"+ i);
	// }
}