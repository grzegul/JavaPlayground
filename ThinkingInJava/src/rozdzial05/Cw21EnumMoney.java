package rozdzial05;
enum Banknoty {
	DYCHA, DWIE_DYCHY, TRZY_DYCHY, CZTERY_DYCHY
}
public class Cw21EnumMoney {
	public static void main (String[] args){
		for (Banknoty b : Banknoty.values()){
			System.out.println(b + ", poz.: " + b.ordinal());
		}
	}
}
