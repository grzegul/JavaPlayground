package rozdzial05;
// nie wiem, czy dok�adnie o to chodzi�o...
import java.util.Scanner;

public class Cw12Tank {
	boolean full = false;
	void fill(){
		full=true;
		System.out.println("Zbiornik zape�niony");
	}
	void empty(){
		full = false;
		System.out.println("Zbiornik opr�niony");
	}
	protected void finalize(){
		if (full == false){
			System.out.println("Zako�czono");
		} else{
			System.out.println("Przed zako�czeniem opr�nij zbiornik!!");
		}
	}
	
	public static void main(String[]args){
		//mo�liwe scenariusze u�ywania obiekt�w:
		Cw12Tank t = new Cw12Tank();
		System.out.println("Podaj przypadek:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		switch (a){
			case 1:
				t.fill();
				t.finalize();
				break;
			case 2:
				t.empty();
				t.finalize();
				break;
			case 3:
				t.fill();
				t.empty();
				t.finalize();
				break;
		}
	}
}
