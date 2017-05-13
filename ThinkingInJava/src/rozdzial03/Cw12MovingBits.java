package rozdzial03;

public class Cw12MovingBits {
	public static void main(String[]args){
		int a = 0xffff;
		int b = 0x800000;
		System.out.println("b = "+Integer.toBinaryString(b));
		System.out.println("a = "+Integer.toBinaryString(a|b));
		a=a<<1;
		System.out.println("a = "+Integer.toBinaryString(a|b));
		while (a>0){
			a=a>>>1;
			System.out.println("a = " + Integer.toBinaryString(a|b));
		}
		
		
	}
}
