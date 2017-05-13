package rozdzial12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Cw08 {

	public static void g() throws Wyjatek{
		throw new Wyjatek("Nowy wyjatek z g()");
	}
	private static Logger logger = Logger.getLogger("Cw07a");
	static void logException(Exception e){
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
	
	public static void main(String[] args) {
		try{
			g();
		}catch(Wyjatek e){
			e.printStackTrace(System.out);
			logException(e);
		}
	}
}
