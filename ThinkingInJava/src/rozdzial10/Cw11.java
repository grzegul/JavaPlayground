package rozdzial10;

interface Human{
	void name();
}

public class Cw11 {
	private class Man implements Human{
		public void name(){
			System.out.println("Kuba");
		}
	}
	public Man getMan(){
		Man m = new Man();
		return m;
	}
	
	public static void main(String[] args) {
		Cw11 c = new Cw11();
		Human h = c.getMan(); //rzutowanie w górê?
		h.name();
		
		//jeszcze rzutowanie w dó³ by siê przyda³o zrobiæ, ¿eby wykazaæ, ¿e name() jest ukryta
		
	}

}
