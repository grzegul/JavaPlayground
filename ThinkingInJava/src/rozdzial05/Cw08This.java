package rozdzial05;
// Ci�g�a nauka jest pi�kna :) i niech chuj strzeli wszystkich autor�w. Chyba, �e to ja taki ciemny jestem :)
public class Cw08This {
	int a=0;
	
	void metoda1(){
		metoda2();
		this.metoda2();		// z tego sposobu si� nie korzysta
	}
	
	void metoda2(){
			System.out.println("a = "+a);
		}

	public static void main(String[]args){
		new Cw08This().metoda1();
	}
}
