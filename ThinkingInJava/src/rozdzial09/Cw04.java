package rozdzial09;

abstract class First{
	abstract void act();
}

class Second extends First{
	void act(){
		System.out.println("Dzia�anie");
	}
}

public class Cw04 {
	static void doingSth(First f){
		//((Second)f).act();	//je�eli nie b�dzie metody act() do przes�oni�cia w klasie bazowej, to potrzebny jest downcasting
		f.act();
	}
	public static void main (String[] args){
		First a = new Second();
		doingSth(a);
	}
}
