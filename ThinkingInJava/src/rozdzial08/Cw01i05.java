package rozdzial08;

class Cycle{
	void ride(){
		System.out.println("Rower jedzie");	
	}
	int wheels(){
		return 0;
	}
	/*void balance(){
		System.out.println("Balance Cycle");
	}*/
}

class Unicycle extends Cycle{
	void ride(){
		System.out.println("Jednoko³owiec jedzie");
	}
	int wheels(){
		return 1;
	}
	void balance(){
		System.out.println("Balance Unicycle");
	}
}
class Bicycle extends Cycle{
	void ride(){
		System.out.println("Dwuko³owiec jedzie");
	}
	int wheels(){
		return 2;
	}
	void balance(){
		System.out.println("Balance Bicycle");
	}
}
class Tricycle extends Cycle{
	void ride(){
		System.out.println("Trójko³owiec jedzie");
	}
	int wheels(){
		return 3;
	}
}

public class Cw01i05 {
	public static void riding(Cycle i){
		i.ride();
		System.out.println(i.wheels());
	}
	public static void main (String[] args){
		Cycle a = new Cycle();
		Cycle b = new Unicycle();
		Cycle c = new Bicycle();
		Cycle d = new Tricycle();

		riding(a);
		riding(b);
		riding(c);
		riding(d);
	}
}
