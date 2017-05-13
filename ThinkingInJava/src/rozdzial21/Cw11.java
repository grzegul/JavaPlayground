package rozdzial21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Cw11 implements Runnable{
	private int id = 0;
	public Cw11(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	private int num1;
	private int num2;
	public int getNum1(){
		return num1;
	}
	public int getNum2(){
		return num2;
	}
	
	public int change(){
		num1++;
		Thread.yield();
		num1++;
		//num2 = num1;
		
		return num1;
		
	}
	
	public void run(){
		while(true){
			change();
			/*int a = getNum1();
			//if(a % 2 != 0){
				System.out.println(getId() + " " + a);
				//System.exit(0);
			//}*/
		}

	}
	
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0; i < 3; i++){
			Cw11 c = new Cw11(i);
			exec.execute(c);
			int a = c.getNum1();
			while(a%2==0){
				int val = c.getNum1();
				//if(val % 2 != 0){
					System.out.println(c.getId() + " " + val);
					//System.exit(0);
				//}
			}
		}
			
		exec.shutdown();
		
		/*Cw11 c = new Cw11();
		exec.execute(c);
		while(true){
			int val1 = c.getNum1();
			int val2 = c.getNum2();
			if(val1 % 2 != 0 | val2 % 2 != 0){
				System.out.println(val1 + " " + val2);
				System.exit(0);
			}
		}*/
	}

}
