package rozdzial10;

class Cos{
	public class Wew1{
		Wew1(String s){
			System.out.println("Konstruktor Cw26.Wew1, s = " + s);
		}
	}
}

public class Cw26 {
	public class Wew2 extends Cos.Wew1{
		Wew2(Cos c){
			c.super("Konstruktor Cos.Wew1, super");
		}
	}

	public static void main(String[] args) {
		Cos cos = new Cos();
		Cw26 c2 = new Cw26();
		Wew2 w = c2.new Wew2(cos);
		
	}

}
