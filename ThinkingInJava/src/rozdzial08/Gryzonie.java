package rozdzial08;

class Gryzonie {
	Gryzonie(){
		System.out.println("Init Gryzonie");
	}
	public String toString(){
		return "Kolor niesprecyzowany";		
	}
	int lifeExpect(){
		return 0;
	}
}
class Mysz extends Gryzonie{
	Mysz(){
		System.out.println("Init Mysz");
	}
	@Override
	public String toString(){
		return "Szary";	
	}
	int lifeExpect(){
		return 3;
	}
	String zachowanie(String enemy){
		if (enemy.equals("Kot")){
			return "Ucieczka!!";
		}
		else{
			return "Uff...";	
		}
	}
}
class Chomik extends Gryzonie{
	Chomik(){
		System.out.println("Init Chomik");
	}
	@Override
	public String toString(){
		return "Rudy";
	}
	int lifeExpect(){
		return 2;
	}
	void zabawa(){
		System.out.println("Kó³ko");
	}
}
