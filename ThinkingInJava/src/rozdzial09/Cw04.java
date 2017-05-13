package rozdzial09;

abstract class First{
	abstract void act();
}

class Second extends First{
	void act(){
		System.out.println("Dzia³anie");
	}
}

public class Cw04 {
	static void doingSth(First f){
		//((Second)f).act();	//je¿eli nie bêdzie metody act() do przes³oniêcia w klasie bazowej, to potrzebny jest downcasting
		f.act();
	}
	public static void main (String[] args){
		First a = new Second();
		doingSth(a);
	}
}
