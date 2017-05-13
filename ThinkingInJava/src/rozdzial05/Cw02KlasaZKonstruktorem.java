package rozdzial05;
// trochê rozwiniête w celu zwizualizowania w³aœciwoœci konstruktorów
class Nowa{
	String a = "Pierwszy";		//pole
	Nowa(){						//Konstruktor!!!!!!!!!!!!
		System.out.println(a);
	}
}

class Nowa2{
	String b;					//pole
	Nowa2(){					//Konstruktor!!!!!!!!!!!!
		b ="Drugi";
		System.out.println(b);
	}
}

class Nowa3{
	Nowa3(String c){			//Konstruktor przeci¹¿ony(?)- musz¹ pobieraæ zmienne ró¿nego typu
		System.out.println(c);
	}
	Nowa3 (int a){
		System.out.println(a+11);
	}
}

public class Cw02KlasaZKonstruktorem {
	public static void main(String[]args){
		new Nowa();
		new Nowa2();
		new Nowa3(22);
		
		new Nowa3("Trzeci");
		//alternatywa?:	trzeba to jeszcze dobrze przeanalizowaæ i poprawiæ
		Nowa3 napis = new Nowa3("Czwarty");
		System.out.println(napis+"RR");
	}
}
