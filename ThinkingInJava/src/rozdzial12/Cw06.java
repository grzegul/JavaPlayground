package rozdzial12;
import java.util.logging.*;
import java.io.*;

class LogEx1 extends Exception{
	private static Logger logger = Logger.getLogger("Log Ex 1");
	public LogEx1(){
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}

class LogEx2 extends Exception{
	private static Logger logger = Logger.getLogger("Log Ex 2");
	public LogEx2(){
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}

public class Cw06 {
	public static void main(String[] agrs){
		try{
			throw new LogEx1();
		}catch(LogEx1 e){
			System.err.println("Przechwycono " + e);
		}
		try{
			throw new LogEx2();
		}catch(LogEx2 e){
			System.err.println("Przechwycono " + e);
		}
	}
}
