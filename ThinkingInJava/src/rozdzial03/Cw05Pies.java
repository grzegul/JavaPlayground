package rozdzial03;

class Dog{
	String name;
	String says;
}

public class Cw05Pies {
	public static void main(String[]args){
		Dog spot = new Dog();
		Dog scrufy = new Dog();
		
		spot.name = "Spot";
		spot.says = "Hau";
				
		scrufy.says = "Wrr";
		scrufy.name = "Scrufy";
		
		System.out.println(spot.name+" says: "+spot.says);
		System.out.println(scrufy.name+" says: "+scrufy.says);
	}
}
