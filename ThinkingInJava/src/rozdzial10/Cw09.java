package rozdzial10;

interface Budynek{
	void openDoor();
}

public class Cw09 {
	public Budynek budynek(){	
		class Szkola implements Budynek{		//KLASA WEWNÊTRZNA W METODZIE
			public void openDoor(){
				System.out.println("Drzwi otwarte");
			}
		}
		return new Szkola();

	}
	
	public static void main(String[] args) {
		Cw09 c = new Cw09();
		Budynek b = c.budynek();
		b.openDoor();
	}

}
