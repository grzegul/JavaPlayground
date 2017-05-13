package rozdzial10;

interface DoTestow{
	void tescik();
	class Testowa implements DoTestow{
		public void tescik(){
			System.out.println("tescik z interfejsu");
		}
	}
}

public class Cw20 implements DoTestow{
	
	public void tescik(){
		System.out.println("tescik z klasy");
	}
	
	public static void main(String[] args) {
		Testowa t = new Testowa();
		t.tescik();
		Cw20 c = new Cw20();
		c.tescik();
	}

}
