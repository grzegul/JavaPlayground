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
		Human h = c.getMan(); //rzutowanie w g�r�?
		h.name();
		
		//jeszcze rzutowanie w d� by si� przyda�o zrobi�, �eby wykaza�, �e name() jest ukryta
		
	}

}
