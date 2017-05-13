package rozdzial10;

public class Cw01Outer {
	class Inner{
	}
	Inner getInner(){
		return new Inner();
	}
	public static void main(String[] args) {
		Cw01Outer co = new Cw01Outer();
		Cw01Outer.Inner i = co.getInner();
	}
}
