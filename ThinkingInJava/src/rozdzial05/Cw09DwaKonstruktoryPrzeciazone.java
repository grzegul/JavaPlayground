package rozdzial05;

public class Cw09DwaKonstruktoryPrzeciazone {
	
	Cw09DwaKonstruktoryPrzeciazone(int a){
		a = a+15;
		System.out.println("a = "+a);
	}
	
	Cw09DwaKonstruktoryPrzeciazone(int x, int a){
		this(a);
		int i = 0;
		System.out.println("i = "+i+", a = "+a);
	}
	
	public static void main(String[]args){
		new Cw09DwaKonstruktoryPrzeciazone(1,10);
	}
}
