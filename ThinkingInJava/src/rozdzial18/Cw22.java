package rozdzial18;

import java.io.*;
import java.util.*;
public class Cw22 {
	public static ArrayList<String> command(String command) {
		boolean err = false;
		ArrayList<String> lista = new ArrayList<String>();
		try {
			Process process = new ProcessBuilder(command.split(" ")).start();
			BufferedReader results = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String s;
			
			while((s = results.readLine())!= null){
//				System.out.println(s);
				lista.add(s);
				
				
			}
			BufferedReader errors = new BufferedReader(new InputStreamReader(process.getErrorStream()));
			// Report errors and return nonzero value
			// to calling process if there are problems:
			while((s = errors.readLine())!= null) {
				System.err.println(s);
				err = true;
			}
			
			
		} catch(Exception e) {
			// Compensate for Windows 2000, which throws an
			// exception for the default command line:
			if(!command.startsWith("CMD /C"))
				command("CMD /C " + command);
			else
				throw new RuntimeException(e);
		}
		if(err){
			throw new OSExecuteException("Errors executing " +	command);
		}
		return lista;	
	}
	public static void main(String[] args){
//		command("javap OSExecuteDemo");
		for(String a: command("javap OSExecuteDemo")){
			System.out.println(a);
		}
	}
}