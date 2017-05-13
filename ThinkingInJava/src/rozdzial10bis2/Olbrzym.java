package rozdzial10bis2;

import rozdzial10bis.Kolos;

public class Olbrzym {
	protected class Golliath implements Kolos{
		public void smash(){
			System.out.println("Bam!!");
		}
	}
	public Kolos kolos(){
		return new Golliath();
	}
}
