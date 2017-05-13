package rozdzial10;

interface Testowy{
	void tescik();
	class Testowa{
		public static void tescik(){
			System.out.println("tescik z interfejsu");
		}
	}
}

public class Cw21 implements Testowy{
	
	public void tescik(){
		System.out.println("tescik z klasy");
	}
	
	public static void main(String[] args) {
		Testowa.tescik();
		Cw21 c = new Cw21();
		c.tescik();
	}

}
