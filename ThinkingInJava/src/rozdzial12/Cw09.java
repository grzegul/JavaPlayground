package rozdzial12;

class Wyj1 extends Exception{}
class Wyj2 extends Exception{}
class Wyj3 extends Exception{}

public class Cw09 {
	public static void zglos(int i) throws Wyj1, Wyj2, Wyj3{
		if(i<0){
			throw new Wyj1();
		}else if (i==0){
			throw new Wyj2();
		}else{
			throw new Wyj3();
		}
	}
	public static void main(String[] args) {
		try{
			zglos(-1);
		}catch(Exception e){
			System.err.println(e.getClass());
			System.err.println(e.getLocalizedMessage());
			e.printStackTrace(System.out);
		}
		
		
	}

}
