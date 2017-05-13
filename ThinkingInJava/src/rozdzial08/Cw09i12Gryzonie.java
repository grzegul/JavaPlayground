package rozdzial08;

public class Cw09i12Gryzonie {
	public static void generuj(Gryzonie g){
		System.out.println(g);
		System.out.println(g.lifeExpect());
		
	}
	public static void pokazZachow(Gryzonie[] g){
		for (Gryzonie i: g){
			generuj(i);
		}
	}
	public static void main (String[] args){
		Gryzonie[] g = {new Mysz(), new Chomik()};
		pokazZachow(g);
		System.out.println(((Mysz)g[0]).zachowanie("Kot"));	//RTTI, str.266
		((Chomik)g[1]).zabawa();
	}
}
