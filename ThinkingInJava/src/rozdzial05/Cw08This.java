package rozdzial05;
// Ci¹g³a nauka jest piêkna :) i niech chuj strzeli wszystkich autorów. Chyba, ¿e to ja taki ciemny jestem :)
public class Cw08This {
	int a=0;
	
	void metoda1(){
		metoda2();
		this.metoda2();		// z tego sposobu siê nie korzysta
	}
	
	void metoda2(){
			System.out.println("a = "+a);
		}

	public static void main(String[]args){
		new Cw08This().metoda1();
	}
}
