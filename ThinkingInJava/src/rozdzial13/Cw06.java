package rozdzial13;

public class Cw06 {
	int i = 1;
	long l = 20L;
	float f = 3.14f;
	double d = 22.2;
	
	public String toString(){
		return String.format("int: %d, long: %dL, float: %.2ff, double: %.2f", i, l, f, d);
	}
	
	public static void main (String[] args){
		Cw06 c = new Cw06();
		System.out.println(c);
	}
}
