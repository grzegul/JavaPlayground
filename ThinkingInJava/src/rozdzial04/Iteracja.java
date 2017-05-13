package rozdzial04;

public class Iteracja {
	static boolean condition(){
		boolean result = Math.random()<0.99;
		System.out.println(result + ", ");
		return result;
	}
	public static void main(String[]args){
		while(condition()){
			System.out.println("Wewn¹trz while");
		}
		System.out.println("Na zewn¹trz while");
	}
}
