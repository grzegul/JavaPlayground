package rozdzial12;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.*;
import java.util.logging.Logger;

class LoggingException extends Exception{
	private static Logger logger = Logger.getLogger("LoggingException");
	public LoggingException(Exception e){
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}

public class Cw07 {

	public static void main(String[] args) {
		String[] s = {"Mama", "Tata", "Corka", "Syn"};
		System.out.println("Podaj indeks: ");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		sc.close();
		
		try{
			System.out.println(s[index]);
		}catch(ArrayIndexOutOfBoundsException e){
			new LoggingException(e);
			//e.printStackTrace(System.out);
			System.out.println("Indeks " + index + " nie istnieje!!");
		}
	}

}
