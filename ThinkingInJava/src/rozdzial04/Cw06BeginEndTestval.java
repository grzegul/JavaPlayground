package rozdzial04;
public class Cw06BeginEndTestval {
	// iloœci argumentów w funkcji, do której siê odwo³ujemy
	static int test(int testval, int target, int begin, int end) {
		if ((begin<=testval)&(testval<=end)){
			if(testval > target)
				return +1;
			else if(testval < target)
				return -1;
			else
				return 0; // Match
		}else return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(test(10, 5, 0, 30));
		System.out.println(test(5, 10, 0, 30));
		System.out.println(test(5, 5, 0, 30));
		
		System.out.println(test(5, 10, 20, 30));
		System.out.println(test(5, 5, 10, 15));
	}
}
