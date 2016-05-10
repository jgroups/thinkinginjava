package me.lbing.innerclass;

public class InhreitInner extends WithInner.Inner{
	InhreitInner(WithInner wi){
		wi.super();
	}
	
	public static void main(String[] args) {
		WithInner wi = new WithInner();
		InhreitInner ii = new InhreitInner(wi);
	}
}



class WithInner{
	class Inner{}
}