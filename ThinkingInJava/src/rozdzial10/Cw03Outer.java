package rozdzial10;

public class Cw03Outer {
	private String str;
	public Cw03Outer(String str){
		this.str = str;
	}
	class Inner{
		public String toString(){
			return "Coœtam: " + str;
		}
	}
	Inner getInner(){
		return new Inner();
	}
	public static void main(String[] args) {
		Cw03Outer co = new Cw03Outer("ddeeefr");
		Cw03Outer.Inner i = co.getInner();
		System.out.println(i.toString());
		System.out.println(i);
	}
}
