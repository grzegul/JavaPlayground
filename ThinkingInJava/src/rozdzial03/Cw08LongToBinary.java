package rozdzial03;

// Zamienia litera� szesnastkowy na dziesi�tny i binarny

public class Cw08LongToBinary {
	public static void main(String[]args){
		long a = 0x2f;
		
		System.out.format("a=%d%n", a);
		System.out.println("a=" + Long.toBinaryString(a));
	}
}
