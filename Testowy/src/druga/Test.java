package druga;

interface Figura {
	public void obliczPole();
}

class Kolo implements Figura{
	int promien; //jaki� konstruktor
	Kolo(int promien){
		this.promien=promien;
	}
	@Override
	public void obliczPole() {
		System.out.println(3.14*promien*promien);
	}
}

class Prostokat implements Figura{
	int a,b; //jaki� konstruktor
	Prostokat(int a,int b){
		this.a=a; this.b=b;
	}
	@Override
	public void obliczPole() {
		System.out.println(a*b);
	}
}

public class Test {
		public static void main(String[] args) {
			Figura obiekt = new Kolo(10);
			Figura obiekt1 = new Prostokat(10,2);
			obiekt.obliczPole();
			/* i w tym momencie program wie, �e ma obliczy� pole ze wzoru na ko�o, bo obiekt jest ko�em,
			 * a z drugiej strony program wie, �e obiekt jest te� figur�, mo�emy zrobi� sobie jak�� list� element�w typu figura,
			 * i przelecie� j� p�tl� nie wnikaj�c czy w danej chwili figura jest ko��m czy kwadratem, a jak nam si� zamarzy
			 * doda� trapez to jest to tylko kwestia dodania nowej klasy i zaimplementowania metody obliczPole w niej.*/
			obiekt1.obliczPole();
		}
}