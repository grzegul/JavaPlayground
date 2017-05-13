package rozdzial08;

public class Cw17AddBalance {
	public static void main (String[]args){
		Cycle b = new Unicycle();
		Cycle c = new Bicycle();
		Cycle d = new Tricycle();
		
		Cycle[] cycle = {b, c, d};
		/*cycle[0].balance();
		cycle[1].balance();
		cycle[2].balance();*/
		
		((Unicycle)cycle[0]).balance();
		((Bicycle)cycle[1]).balance();
		//((Tricycle)cycle[2]).balance();
	}
}

// bez metody balance() w klasie bazowej trzeba rzutowaæ w dó³, ¿eby nie wyrzuca³ b³êdów