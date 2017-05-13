package rozdzial12;

public class Cw01 {
	public static void f() throws Exception{
		throw new Exception("Nowy wyjatek!!!");
	}
	public static void main (String[] args){
		try{
			f();
		}catch(Exception e){
			e.printStackTrace(System.out);
		}finally{
			System.out.println("A jednak!!! Finally!!");
		}
	}
}
