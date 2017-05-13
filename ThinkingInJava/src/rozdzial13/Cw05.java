package rozdzial13;
import java.util.*;

public class Cw05 {

	public static void main(String[] args) {
		Formatter f = new Formatter(System.out);
		int i = 121;
		f.format("i: %d, %b, %s, %c, %x, %h\n", i, i, i, i, i, i);
		f.close();
	}

}
//  nie robiê wszystkich, bo nie jestem pewien, ¿e o to chodzi