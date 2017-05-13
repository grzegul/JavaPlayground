package rozdzial04;
// Wyszukuje czterocyfrowe "liczby wampirze", dla których abcd==ab*cd (prawa sstrona to dowolna kolejnoœæ, czyli np. ba*cd, da*cb, itd.
// Po przecinku wypisuje numer indeksu tablicy mo¿liwych "liczb wampirzych"

class CreateTab{
	int[]create(){
		int[]tab = new int[3216];
		int licznik = 0;
		for(int i=0; i<100; i++){
			for(int j=i; j<100; j++){
				if((i*j>1000)&&((i*j)%100!=0)){
					tab[licznik] = i*j;
					licznik++;
				}
			}
		}
		return tab;
	}
}

public class Cw10LiczbyWampirzeKlasy {
	
	public static void main(String[]args){
		
		//Wywo³anie tablicy mo¿liwych liczb wampirzych
		CreateTab tablica = new CreateTab();
		int[]vamp = tablica.create();
		/*for(int i=0; i<3216; i++){
			System.out.println(vamp[i]);
		}*/

		String[]vampStr = new String[vamp.length];
		char[][]rozbicie = new char[vamp.length][4];
		 
		 
		//Przepisanie tablicy int na String
		for (int i=0; i<vamp.length; i++){
			vampStr[i] = Integer.toString(vamp[i]);
		}
		
		//Rozbicie tablicy String na char i sprawdzenie ka¿dej kombinacji
		for (int i=0; i<vampStr.length; i++){
			for(int j=0; j<4; j++){
				rozbicie[i][j] = vampStr[i].charAt(j);
			}
			String a = String.valueOf(rozbicie[i][0]);
			String b = String.valueOf(rozbicie[i][1]);
			String c = String.valueOf(rozbicie[i][2]);
			String d = String.valueOf(rozbicie[i][3]);
			if(Integer.valueOf(a+b)*Integer.valueOf(c+d)==vamp[i]){
				System.out.println(vamp[i]+", "+i+", "+Integer.valueOf(a+b)+", "+Integer.valueOf(c+d));
			}else if(Integer.valueOf(a+b)*Integer.valueOf(d+c)==vamp[i]){
				System.out.println(vamp[i]+", "+i+", "+Integer.valueOf(a+b)+", "+Integer.valueOf(d+c));
			}else if(Integer.valueOf(b+a)*Integer.valueOf(d+c)==vamp[i]){
				System.out.println(vamp[i]+", "+i+", "+Integer.valueOf(b+a)+", "+Integer.valueOf(d+c));
			}else if(Integer.valueOf(b+a)*Integer.valueOf(c+d)==vamp[i]){
				System.out.println(vamp[i]+", "+i+", "+Integer.valueOf(b+a)+", "+Integer.valueOf(c+d));
			}else if(Integer.valueOf(a+c)*Integer.valueOf(b+d)==vamp[i]){
				System.out.println(vamp[i]+", "+i+", "+Integer.valueOf(a+c)+", "+Integer.valueOf(b+d));
			}else if(Integer.valueOf(a+c)*Integer.valueOf(d+b)==vamp[i]){
				System.out.println(vamp[i]+", "+i+", "+Integer.valueOf(a+c)+", "+Integer.valueOf(d+b));
			}else if(Integer.valueOf(c+a)*Integer.valueOf(d+b)==vamp[i]){
				System.out.println(vamp[i]+", "+i+", "+Integer.valueOf(c+a)+", "+Integer.valueOf(d+b));
			}else if(Integer.valueOf(c+a)*Integer.valueOf(b+d)==vamp[i]){
				System.out.println(vamp[i]+", "+i+", "+Integer.valueOf(c+a)+", "+Integer.valueOf(b+d));
			}else if(Integer.valueOf(a+d)*Integer.valueOf(b+c)==vamp[i]){
				System.out.println(vamp[i]+", "+i+", "+Integer.valueOf(a+d)+", "+Integer.valueOf(b+c));
			}else if(Integer.valueOf(a+d)*Integer.valueOf(c+b)==vamp[i]){
				System.out.println(vamp[i]+", "+i+", "+Integer.valueOf(a+d)+", "+Integer.valueOf(c+b));
			}else if(Integer.valueOf(d+a)*Integer.valueOf(c+b)==vamp[i]){
				System.out.println(vamp[i]+", "+i+", "+Integer.valueOf(d+a)+", "+Integer.valueOf(c+b));
			}else if(Integer.valueOf(d+a)*Integer.valueOf(b+c)==vamp[i]){
				System.out.println(vamp[i]+", "+i+", "+Integer.valueOf(d+a)+", "+Integer.valueOf(b+c));
			}	
		}
		//Sprawdzenie
		/*int i = 3015;
		System.out.println(vamp[i]);*/
	}
}
