package paczka;

import java.util.ArrayList;
// Napisz klas� Pracownik, kt�ra przechowuje trzy pola: -Imi� -Nazwisko -Wiek Nast�pnie utw�rz klas� Firma,
//w kt�rej wykorzystasz klas� pracownik do utworzenia dw�ch obiekt�w przechowuj�cych dane pracownik�w (wymy�l sobie jakie�) i p�niej wy�wietlasz je na ekran
import java.util.Scanner;

public class Firma
{
	public static void main(String[] args)
	{		
		System.out.format("Podaj liczb� pracownik�w: ");
		Scanner odczyt = new Scanner(System.in);
		int ilPracownikow = odczyt.nextInt();
		
		odczyt.nextLine();	// "newline character is probably not consumed" - zerowanie pami�ci? pierwsza taka linia jest omijana
		
		ArrayList<Pracownik> pracownicy = new ArrayList<Pracownik>();
		
		for(int i=0; i<ilPracownikow; i++)
		{	
			System.out.format("Podaj dane pracownika %d (imie/nazwisko/wiek):%n", i+1);
			// Wczytanie danych
			String imie = odczyt.nextLine();
			String nazw = odczyt.nextLine();
			int wiek = odczyt.nextInt();
			// Wczytanie ko�ca linii
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
