package rozdzial05;
// wykonanie podwójne z klas¹ zewnêtrzn¹, ale nie wiem, czy o to chodzi³o
class Dodatkowa{
	Dodatkowa(String str){								//konstruktor
		System.out.println("Wartoœæ str: "+str);
	}
}

public class Cw17i18ObiektKlasyString {
	Cw17i18ObiektKlasyString(String s){					//konstruktor
		System.out.println("Wartoœæ s: "+s);
	}
	public static void main(String[]args){
		Dodatkowa[]tab = new Dodatkowa[5];
		for(Dodatkowa i: tab){
			new Dodatkowa("D");
		}
	
		Cw17i18ObiektKlasyString[] t = new Cw17i18ObiektKlasyString[3];
		for(Cw17i18ObiektKlasyString i: t){
			new Cw17i18ObiektKlasyString("C");
		}
	}
}
