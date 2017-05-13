package rozdzial12;

public class Cw02 {
	public static void g()throws Exception{
		throw new Exception("wyjatek g()");
	}
	public static void main(String[] args) {
		Cw02 c = null;
		try{
			c.g();	
		}catch(Exception e){
			e.printStackTrace(System.out);
		}
		
	}

}
