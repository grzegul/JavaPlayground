package rozdzial10;

interface Budynek3{
	void openDoor();
}

public class Cw13 {
	public Budynek3 budynek3(){	
		return new Budynek3(){			//	ANONIMOWA KLASA WEWNÊTRZNA
			public void openDoor(){
				System.out.println("Drzwi otwarte");
			}
		};

	}
	
	public static void main(String[] args) {
		Cw13 c = new Cw13();
		Budynek3 b = c.budynek3();
		b.openDoor();
	}

}
