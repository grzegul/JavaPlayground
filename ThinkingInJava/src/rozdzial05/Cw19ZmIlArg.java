package rozdzial05;

public class Cw19ZmIlArg {
	
	static void varArgs(String...args){
		for(String s : args){
			System.out.print(s + ", ");
		}
	}
	
	public static void main(String[]args){
		String[]tab = new String[5];
		for(int x=0; x<tab.length; x++){
			int xx = x*5;
			tab[x] = Integer.toString(xx);
		}
		varArgs(new String[]{"x", "Y", "max", "siodlo"});
		varArgs(tab);
	}
}
