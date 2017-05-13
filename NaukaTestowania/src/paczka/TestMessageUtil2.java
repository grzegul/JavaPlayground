package paczka;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;


public class TestMessageUtil2 {

   String message = "Robert";	
   MessageUtil2 messageUtil2 = new MessageUtil2(message);
   
   @Ignore
   @Test(timeout = 1000)
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");     
      messageUtil2.printMessage();
   }
   @Test(expected = ArithmeticException.class)
   public void testDivideMessage() {	
      System.out.println("Inside testDivideMessage()");     
      messageUtil2.divideMessage();
   }
   @Ignore
   @Test
   public void testSalutationMessage() {	
      System.out.println("Inside testPrintMessage()");    
      assertEquals(message, messageUtil2.salutationMessage());     
   }
}