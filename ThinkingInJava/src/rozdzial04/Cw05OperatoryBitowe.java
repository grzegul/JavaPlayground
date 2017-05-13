package rozdzial04;
// klasa zastêpuje Integer.toBinaryString
class IntToBin{
	static String translate(int liczba_wej){
		int [] tab = new int[20];
		int n = 0;
		while (liczba_wej!=0){
			tab[n] = liczba_wej%2;
			liczba_wej = liczba_wej/2;
			n++;
		}
		// nie podoba mi sie poni¿szy kod. chcia³bym to zrobiæ bez u¿ycia .toString()
		StringBuffer result = new StringBuffer();
		for(int i=n-1; i>=0; i--){
			result.append(tab[i]);
		}
		String str_wyj ="T³umaczone: " + result.toString();
		return str_wyj;
	}
}

public class Cw05OperatoryBitowe {
	public static void main(String[]args){
		int a = 0x00aa;
		int b = 0x0055;
		
		System.out.println(IntToBin.translate(a));
		
		
		// Stary program Æw 10 z rozdzia³u 3
		System.out.println("a = "+Integer.toBinaryString(a));
		System.out.println("b = "+"0"+Integer.toBinaryString(b));
				
		/*System.out.println("a&b = "+ Integer.toBinaryString(a&b));
		System.out.println("a|b = "+ Integer.toBinaryString(a|b));
		System.out.println("a^b = "+ Integer.toBinaryString(a^b));	//XOR
		System.out.println("~a = "+ Integer.toBinaryString(~a));
		
		System.out.println("a&=b = "+ Integer.toBinaryString(a&=~b));
		System.out.println("a|=b = "+ Integer.toBinaryString(a|=b));
		System.out.println("a^=b = "+ Integer.toBinaryString(a^=b));*/
	}
}
