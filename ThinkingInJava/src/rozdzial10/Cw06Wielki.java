package rozdzial10;
import rozdzial10bis.*;
import rozdzial10bis2.*;

public class Cw06Wielki extends Olbrzym {
	public Kolos zwr(){
		Olbrzym o = new Cw06Wielki();
		Kolos k = o.kolos();
		return k;
	}
	
	public static void main (String[] args){
		Cw06Wielki x = new Cw06Wielki();
		x.zwr().smash();
	}
}
