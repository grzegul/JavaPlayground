package rozdzial10;

interface Budynek2{
	void openDoor();
}

public class Cw10 {
	private void lightsOn(boolean b){
		if (b){
			class Dom implements Budynek3{
				public void openDoor(){
					System.out.println("Zamknij!!");
				}	
			}
			Dom d = new Dom();
			d.openDoor();
		}
	}
	
	public static void main(String[] args) {		
		Cw10 c = new Cw10();
		c.lightsOn(true);
	}

}
