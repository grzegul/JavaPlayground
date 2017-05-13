package rozdzial05;
// enum jest w poprzednim �wiczeniu - dost�p pakietowy
/* enum Banknoty {
	DYCHA, DWIE_DYCHY, TRZY_DYCHY, CZTERY_DYCHY
}*/

class Details{
	Banknoty szczegol;
	Details(Banknoty szczegol){
		this.szczegol = szczegol;
	}
	void opis(){
		System.out.println("Wybrales: ");
		switch(szczegol){
		case DYCHA:			System.out.println("Dziesi�� PLN");
			break;
		case DWIE_DYCHY:	System.out.println("Dwadzie�cia PLN");
			break;
		case TRZY_DYCHY:	System.out.println("Trzydzie�ci PLN");
			break;
		case CZTERY_DYCHY:	System.out.println("Czterdzie�ci PLN");
			break;
		}
	}
}

public class Cw22EnumMoneySwitch {
	public static void main (String[] args){
		Details d = new Details(Banknoty.DYCHA),
				dd = new Details(Banknoty.DWIE_DYCHY),
				ddd = new Details(Banknoty.TRZY_DYCHY),
				dddd = new Details(Banknoty.CZTERY_DYCHY);
		dd.opis();
		ddd.opis();
		d.opis();
		dddd.opis();
	}
}
