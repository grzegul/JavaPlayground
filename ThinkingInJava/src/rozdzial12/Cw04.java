package rozdzial12;

class Wyjatek extends Exception{
	
	public Wyjatek(String msg){
		super(msg);
		drukuj(msg);
	}
	public void drukuj(String msg){
		System.out.println(msg);
	}
}

public class Cw04 {
	public static void f() throws Wyjatek{
		throw new Wyjatek("Nowy wyjatek z f()");
	}
	public static void main(String[] args) {
		try{
			f();
		}catch(Wyjatek e){
			e.printStackTrace(System.out);
		}
	}

}
