package rozdzial12;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.*;
import java.util.logging.Logger;

public class Cw07a {
	private static Logger logger = Logger.getLogger("Cw07a");
	static void logException(Exception e){
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
	
	public static void main(String[] args) {
		String[] s = {"Mama", "Tata", "Corka", "Syn"};
		System.out.println("Podaj indeks: ");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		sc.close();
		
		try{
			System.out.println(s[index]);
		}catch(ArrayIndexOutOfBoundsException e){
			logException(e);
			//System.out.println("Indeks " + index + " nie istnieje!!");
		}
	}

}
