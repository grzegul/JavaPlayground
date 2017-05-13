package uzytki;

// Czyta zmak i zamienia go na kod binarny

import java.util.Scanner;
public class Cw13CharToBinary {
	public static void main(String[]args){
		System.out.println("Podaj znak:");
		Scanner sc = new Scanner(System.in);
		char a = sc.nextLine().charAt(0);
		sc.close();
		System.out.println("Wynik: " + Integer.toBinaryString(a));
	}
}
