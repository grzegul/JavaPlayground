package rozdzial09;

abstract class Base{
	Base(){
		print(3);
	}
	abstract void print(int i);
}
class Pochodna extends Base{
	int i = 44;
	void print(int i){
		//this.i = i;
		System.out.println("wartosc = " + i);
	}
}

public class Cw03 {
	public static void main (String[] args){
		Base b = new Pochodna();
		b.print(15);
	}
}
