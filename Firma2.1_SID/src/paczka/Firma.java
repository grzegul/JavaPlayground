package paczka;

import java.util.ArrayList;
// Napisz klasï¿½ Pracownik, ktï¿½ra przechowuje trzy pola: -Imiï¿½ -Nazwisko -Wiek Nastï¿½pnie utwï¿½rz klasï¿½ Firma,
//w ktï¿½rej wykorzystasz klasï¿½ pracownik do utworzenia dwï¿½ch obiektï¿½w przechowujï¿½cych dane pracownikï¿½w (wymyï¿½l sobie jakieï¿½) i pï¿½niej wyï¿½wietlasz je na ekran
import java.util.Scanner;

public class Firma
{
	public static void main(String[] args)
	{		
		System.out.format("Podaj liczbê pracowników: ");
		Scanner odczyt = new Scanner(System.in);
		int ilPracownikow = odczyt.nextInt();
		
		odczyt.nextLine();	// "newline character is probably not consumed" - zerowanie pamiï¿½ci? pierwsza taka linia jest omijana
		
		ArrayList<Pracownik> pracownicy = new ArrayList<Pracownik>();
		
		for(int i=0; i<ilPracownikow; i++)
		{	
			System.out.format("Podaj dane pracownika %d (imie/nazwisko/wiek):%n", i+1);
			// Wczytanie danych
			String imie = odczyt.nextLine();
			String nazw = odczyt.nextLine();
			int wiek = odczyt.nextInt();
			// Wczytanie koñca linii
			odczyt.nextLine();
			// Stworzenie obiektu Pracownik
			Pracownik pracownik = new Pracownik(imie, nazw, wiek);
			// Dodanie obiektu do listy
			pracownicy.add(pracownik);
		}
		odczyt.close();


		System.out.println("Pracownicy firmy to:");
		for (Pracownik pracownik : pracownicy) {
			System.out.format("%s %s %d%n", pracownik.getImie(), pracownik.getNazw(), pracownik.getWiek());
		}
	}
}
