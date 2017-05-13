package rozdzial04;

// Generuje 25 losowych liczb i sprawdza wzglêdem innej losowo generowanej liczby. Obie ograniczone do 47

import java.util.*;
public class Cw03WartosciLosowe {
	public static void main(String[]args){
		
		int i = 0;
		while (i<25){
			Random rand = new Random();
			int a = rand.nextInt(47);
			int b = rand.nextInt(47);
			if (a<b){
				System.out.println((i+1) + ": " + a + " < " + b);
			} else if (a>b){
				System.out.println((i+1) + ": " + a + " > " + b);
			} else {
				System.out.println((i+1) + ": " + a + " = " + b);
			}
			i++;
		}
	}
}
