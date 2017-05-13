package rozdzial05;

public class Cw06MetodaPrzeciazonaZOdwrArg {
	void bark(int a){
		System.out.println("woo");
	}
	void bark(float a){
		System.out.println("hau");
	}
	void bark(char a){
		System.out.println("wrr");
	}
	void bark(char a, int b){
		System.out.println("auuuu");
	}
	void bark(int b, char a){
		System.out.println("woof");
	}
	public static void main(String[]args){
		Cw06MetodaPrzeciazonaZOdwrArg doggy = new Cw06MetodaPrzeciazonaZOdwrArg();
		doggy.bark(12);
		doggy.bark(15.3f);
		doggy.bark('g');
		doggy.bark('a', 2);
		doggy.bark(34, 'e');
	}
}
