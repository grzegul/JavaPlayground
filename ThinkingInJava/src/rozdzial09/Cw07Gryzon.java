package rozdzial09;

public class Cw07Gryzon {
	public static void generuj(Gryzon g){
		System.out.println(g);
		System.out.println(g.lifeExpect());
		
	}
	public static void pokazZachow(Gryzon[] g){
		for (Gryzon i: g){
			generuj(i);
		}
	}
	public static void main (String[] args){
		Gryzon[] g = {new Myszka(), new Chomiczek()};
		pokazZachow(g);
		System.out.println(((Myszka)g[0]).zachowanie("Kot"));	//RTTI, str.266
		((Chomiczek)g[1]).zabawa();
	}
}
