package paczka;

import org.junit.runner.*;
import org.junit.runner.notification.Failure;

public class AtUnitExampleTestRunner {

	public static void main(String[] args) throws Exception {
		Result result = JUnitCore.runClasses(AtUnitExample.class);
		
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	}
}