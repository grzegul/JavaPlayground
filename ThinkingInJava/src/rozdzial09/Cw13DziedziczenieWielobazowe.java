package rozdzial09;

interface Human{
	void name();
}
interface Man extends Human{
	void strength();
}
interface Woman extends Human{
	void multiTask();
}
interface Child extends Man, Woman{
	void curiosity();
}

public class Cw13DziedziczenieWielobazowe implements Child {
	public void name(){
		System.out.println("imie");
	}
	public void strength(){
		System.out.println("si³y w ciul");
	}
	public void multiTask(){
		System.out.println("tylko babki to umieja");
	}
	public void curiosity(){
		System.out.println("ciekawoœæ");
	}
	
	public static void main(String[] args) {
		Cw13DziedziczenieWielobazowe c = new Cw13DziedziczenieWielobazowe();
		c. name();
		c.strength();
		c.multiTask();
		c.curiosity();
	}
}
