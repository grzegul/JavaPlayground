package rozdzial03;

public class Cw10OperatoryBitowe {
	public static void main(String[]args){
		int a = 0xaa;
		int b = 0x55;
		
		System.out.println("a = "+Integer.toBinaryString(a));
		System.out.println("b = "+"0"+Integer.toBinaryString(b));
				
		System.out.println("a&b = "+ Integer.toBinaryString(a&b));
		System.out.println("a|b = "+ Integer.toBinaryString(a|b));
		System.out.println("a^b = "+ Integer.toBinaryString(a^b));	//XOR
		System.out.println("~a = "+ Integer.toBinaryString(~a));
		
		System.out.println("a&=b = "+ Integer.toBinaryString(a&=~b));
		System.out.println("a|=b = "+ Integer.toBinaryString(a|=b));
		System.out.println("a^=b = "+ Integer.toBinaryString(a^=b));
	}
}
