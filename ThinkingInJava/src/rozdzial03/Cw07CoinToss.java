package rozdzial03;

//Symulacja rzutu monet�

import java.util.*;

public class Cw07CoinToss {
	public static void main(String[]args){
		Random rand = new Random();
		int i = rand.nextInt(2);
		if (i==1){
			System.out.println("Orze�");
		} else {
			System.out.println("Reszka");
		}
	}
}
