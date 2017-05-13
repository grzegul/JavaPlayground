package rozdzial06;

class Nowa{
	protected int x = 1;
	protected String a = "aaaaa";
}

public class CW06PolaChronione {
	public static void main(String[]args){
		Nowa n = new Nowa();
		System.out.println(n.x);
		System.out.println(n.x + " " + n.a);
		n.x = 2;
		System.out.println(n.x);
	}
}
