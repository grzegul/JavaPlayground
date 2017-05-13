package rozdzial09;
import java.nio.CharBuffer;
import java.util.*;

class RandChars{
	private static Random rand = new Random();
	private static final char[] lowers = "abdefghijklmnoprstuwxyz".toCharArray();
	public char next(){
		return lowers[rand.nextInt(lowers.length)];
	}
	/*public static void main(String[] args) {
		RandChars rc = new RandChars();
		for(int i=0; i<10; i++){
			System.out.println(rc.next());
		}
	}*/
}

public class Cw16 extends RandChars implements Readable{
	private int count;
	public Cw16(int count){
		this.count = count;
	}
	public int read(CharBuffer cb){
		if(count--==0){
			return -1;
		}
		for(int i=0; i<10; i++){	//iloœæ znaków
			cb.append(next());
		}
		cb.append(" ");		//nowa linia??
		return cb.length();
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(new Cw16(3));	//iloœæ s³ów
		while(s.hasNext()){
			System.out.println(s.next());
		}
		s.close();
	}
}
