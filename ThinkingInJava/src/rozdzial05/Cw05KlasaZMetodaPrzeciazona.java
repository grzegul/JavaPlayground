package rozdzial05;

public class Cw05KlasaZMetodaPrzeciazona {
	void bark(int a){
		System.out.println("woo");
	}
	void bark(float a){
		System.out.println("hau");
	}
	void bark(char a){
		System.out.println("wrr");
	}

	public static void main(String[]args){
		Cw05KlasaZMetodaPrzeciazona doggy = new Cw05KlasaZMetodaPrzeciazona();
		doggy.bark(12);
		doggy.bark(15.3f);
		doggy.bark('g');
	}
}
