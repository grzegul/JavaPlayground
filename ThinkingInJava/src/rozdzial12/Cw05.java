package rozdzial12;

import java.util.Scanner;

public class Cw05 {

	public static void main(String[] args) {
		String[] s = {"Mama", "Tata", "Corka", "Syn"};
		System.out.println("Podaj indeks: ");
		Scanner sc = new Scanner(System.in);
		int index = -1;
		
		boolean kont = false;
		while(!kont){
			try{
				index = sc.nextInt();
				System.out.println(s[index]);
			}catch(ArrayIndexOutOfBoundsException e){
				e.printStackTrace(System.out);
				System.out.println("Indeks " + index + " nie istnieje!! Podaj indeks: ");
			}
			kont = (index<0) || (index>=s.length) ? false : true;
		}
		sc.close();
	}

}
