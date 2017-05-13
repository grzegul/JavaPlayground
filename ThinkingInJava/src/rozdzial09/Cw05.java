package rozdzial09;

import rozdzial09Cw05i06.Dziecko;
public class Cw05 implements Dziecko {

	public void imie(){
		System.out.println("Olo");
	}
	public int wiek(){
		return 3;
	}
	public void zabawa(){
		System.out.println("Ja chce na pababaw");
	}
	public static void main(String[] args) {
		Cw05 c = new Cw05();
		c.imie();
		System.out.println(c.wiek());
		c.zabawa();
	}

}
