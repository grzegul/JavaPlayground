package paczka;

public class Pracownik
{
	private String imie;
	private String nazw;
	private int wiek;
	
	public Pracownik(String imie, String nazw, int wiek) {		//konstruktor
		this.imie = imie;
		this.nazw = nazw;
		this.wiek = wiek;
	}

	public String getImie() {
		return imie;			// ciekawe, czy mo¿na zapisaæ jako "return this.imie"?
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazw() {
		return nazw;
	}

	public void setNazw(String nazw) {
		this.nazw = nazw;
	}

	public int getWiek() {
		return wiek;
	}

	public void setWiek(int wiek) {
		this.wiek = wiek;
	}

	@Override
	public String toString() {
		return "Pracownik [imie=" + imie + ", nazw=" + nazw + ", wiek="+ wiek + "]";
	}
	
	
}
