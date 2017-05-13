package rozdzial12;

class Exg extends Exception{}
class Wyj extends Exception{}

public class Cw10{
	
	public void f()throws Wyj{
		System.out.println("f()");
		try{
			g();
		}catch(Exception e){
			System.err.println(e);
			throw new Wyj();
		}
	}
	public void g() throws Exg{
		System.out.println("g()");
		throw new Exg();
	}
	
	public static void main (String[] args){
		Cw10 c = new Cw10();
		try{
			c.g();
		}catch(Exception e){
			e.printStackTrace(System.out);
		}
		try{
			c.f();
		}catch(Exception e){
			e.printStackTrace(System.out);
		}
	}
}
