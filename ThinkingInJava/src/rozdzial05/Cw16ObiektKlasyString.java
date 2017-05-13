package rozdzial05;

public class Cw16ObiektKlasyString {
	public static void main(String[]args){
		String[]tablica = new String[]{"TinkiWinki", "Dipsi", "Lala", "Po"};
		for(int i=0; i<tablica.length; i++){
			System.out.println(tablica[i]);
		}
		//równowa¿ne drukowanie :))
		for (String i:tablica){
			System.out.println(i);
		}
		
	}
}
