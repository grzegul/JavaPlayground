package rozdzial18;

import java.io.*;

import uzytki.MsToDate;
public class Cw06{

	public static void main(String[] args) {
		
		new ProcessFiles(new ProcessFiles.Strategy() {
			public void process(File file) {
				long data = new MsToDate().STM("01/01/2016");
				if(file.lastModified() > data){
					System.out.println(file + " " + new MsToDate().MTS(file.lastModified()));
				}
				
			}
		}, "java").start(args);
	}
}