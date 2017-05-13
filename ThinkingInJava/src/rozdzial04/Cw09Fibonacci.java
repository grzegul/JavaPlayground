package rozdzial04;
import java.util.Scanner;

class OblFibonacci{
	// tutaj chcia³bym przenieœæ kod wykonuj¹cy  if else
}
class Scan{
	static int skanuj(){
		System.out.print("Podaj liczbê wyrazów ci¹gu Fibonacci'ego: ");
		Scanner sc = new Scanner(System.in);
		int liczba = sc.nextInt();
		sc.close();
		return liczba;
	}
}
public class Cw09Fibonacci {
	public static void main(String[]args){
		int ilWyrazow = Scan.skanuj();
		int[]tab = new int[ilWyrazow];
		if (ilWyrazow == 1){
			tab[0] = 0;
			System.out.println("Wynik: "+tab[0]);
		}else if (ilWyrazow == 2){
			tab[0] = 0;
			tab[1] = 1;
			System.out.println("Wynik: "+tab[0]+","+tab[1]);
		}else if (ilWyrazow == 3){
			tab[0] = 0;
			tab[1] = 1;
			tab[2] = 1;	
			System.out.println("Wynik: "+tab[0]+","+tab[1]+","+tab[2]);
		}else{
			tab[0] = 0;
			tab[1] = 1;
			tab[2] = 1;	
			System.out.print("Wynik: " + tab[0]+","+tab[1]+","+tab[2]);
			for (int i=3; i<ilWyrazow; i++){
				tab[i] = tab[i-1]+tab[i-2];
				System.out.print(","+tab[i]);
			}
		}
	}
}
