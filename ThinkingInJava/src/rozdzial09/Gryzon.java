package rozdzial09;

interface Gryzon {
	String toString();
	int lifeExpect();
}
class Myszka implements Gryzon{
	Myszka(){
		System.out.println("Init Mysz");
	}
	@Override
	public String toString(){
		return "Szary";	
	}
	public int lifeExpect(){
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
class Chomiczek implements Gryzon{
	Chomiczek(){
		System.out.println("Init Chomik");
	}
	@Override
	public String toString(){
		return "Rudy";
	}
	public int lifeExpect(){
		return 2;
	}
	void zabawa(){
		System.out.println("Kó³ko");
	}
}
