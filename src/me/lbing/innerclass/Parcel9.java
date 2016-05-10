package me.lbing.innerclass;

public class Parcel9 {
	public Destination destination(String dest) {//这里dest没有定义成final
		return new Destination() {
			private String label = dest;
			public String readable() {
				return label;
			}
		};
	}

	public static void main(String[] args) {
		Parcel9 p = new Parcel9();
		Destination destination = p.destination("hehheheh");
		String readable = destination.readable();
		System.out.println(readable);
	}
}

interface Destination {
	public String readable();
}
