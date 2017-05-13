package rozdzial12;
import java.util.*;
public class Cw03 {

	public static void main(String[] args) {
		String[] s = {"Mama", "Tata", "Corka", "Syn"};
		System.out.println("Podaj indeks: ");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		sc.close();
		
		try{
			System.out.println(s[index]);
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace(System.out);
			System.out.println("Indeks " + index + " nie istnieje!!");
		}
	}

}
