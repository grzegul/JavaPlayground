package rozdzial03;

public class Cw09ZapisWykladniczy {
	public static void main(String[]args){
		
		double a = Math.pow(2, 1011)-1;
		float f = -2.147483648E9f; //Math.pow(-2, 31)
		float F = 2.147483647E9f; //Math.pow(2, 31)-1
		double d = Math.pow(-2, 63);
		double D = Math.pow(2, 63);
		
		System.out.println("a="+a);
		System.out.println("float min="+f);
		System.out.println("float max="+(F-1));
		System.out.println("double min="+d);
		System.out.println("double max="+(D-1));
	}
}
