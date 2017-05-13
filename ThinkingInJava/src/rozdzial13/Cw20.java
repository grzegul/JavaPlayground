package rozdzial13;

import java.util.*;

public class Cw20 {
	int i = 0;
	long l = 0;
	float f = 0;
	double d = 0;
	
	String wynik = "";
	String xxx = "";
	
	Cw20(String s){
		Scanner sc = new Scanner(s);
		while(sc.hasNext()){
			String w = sc.next();
			
			if (w.matches("\\b[0-9]+\\b")){
				i = Integer.valueOf(w);
			}else if((w.matches("\\b[0-9]+L"))){
				if(w.matches("\\b[0-9]+L")){
					xxx = w.replaceFirst("L", "");	
				}
				l = Long.valueOf(xxx);
			}else if (w.matches("\\b[0-9]+(.[0-9]+)?d?")){
				d = Double.valueOf(w);
			}else if (w.matches("\\b[0-9]+(.[0-9]+)?f{1}")){
				f = Float.valueOf(w);
			}
			
		}
		sc.close();		
	}
	
	public String toString(){
		return "int: " + i + ", long: " + l + "L" + ", float: " + f + "f" + ", double: " + d + "d";
	}
	
	public static void main (String[] args){
		Cw20 c = new Cw20("20.545f 4 45.6654d 265L");
		System.out.println(c);
	}
}
