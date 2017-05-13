package paczka;

public class MessageUtil2 {

	   private String message;

	   //Constructor
	   //@param message to be printed
	   public MessageUtil2(String message){
	      this.message = message;
	   }

	   // prints the message
	   public void printMessage(){
	      System.out.println(message);
	      while(true);
	   }
	   
	   public void divideMessage(){
		      System.out.println("divide");
		      int a = 0;
		      int b = 1/a;
		      System.out.println(b);
		   }
	   
	   public String salutationMessage(){
		   message =  "Hi!" + message;  
		   System.out.println(message);
		      return message;
		   }
	}