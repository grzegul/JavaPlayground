package rozdzial10;

public class Cw19 {

	public static class Zadanie{
		public void drukuj(){
			System.out.println("Drukowanie wewn 1");
		}
		public static class Zadanie2{
			public void drukuj(){
				System.out.println("Drukowanie wewn 2");
			}
		}
	}
	
	public class Zadanie3{
		public void drukuj(){
			System.out.println("Drukowanie wewn 3");
		}
		public class Zadanie4{
			public void drukuj(){
				System.out.println("Drukowanie wewn 4");
			}
		}
	}
	
	public static void main (String[] args){
		Zadanie z = new Zadanie();
		z.drukuj();
		//Zadanie2 z2 = new Zadanie2();
		//z2.drukuj();
		Cw19 c = new Cw19();
		Zadanie3 z3 = c.new Zadanie3();
		z3.drukuj();
		Zadanie3.Zadanie4 z4 = z3.new Zadanie4();
		z4.drukuj();
	}
}
