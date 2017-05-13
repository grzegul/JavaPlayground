package rozdzial10;

class Niebo{
	Niebo (String s){
		System.out.println("Konstruktor Niebo: " + s);
	}
}

public class Cw15 {
	
	Niebo niebo(String s){
		return new Niebo(s){
			void drukuj(){	
				System.out.println(s);
			}
		};
	}
	
	public static void main(String[] args) {
		Cw15 c = new Cw15();
		Niebo n = c.niebo("do wynajêcia");
	}

}
