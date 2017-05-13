package rozdzial03;

public class Cw11MovingBit {
	public static void main(String[]args){
		int a = 0x4000;
		int b = 0x5555;
		
		System.out.println("a = "+Integer.toBinaryString(a));
		
		while (a>0){
			a=a>>1;
			System.out.println("a = " + Integer.toBinaryString(a));
		}
		
		
	}
}
