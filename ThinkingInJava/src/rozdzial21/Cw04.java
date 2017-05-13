package rozdzial21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Cw04 implements Runnable{
	public void run(){
		Fibonacci gen1 = new Fibonacci(20);
		for(int i = 0; i < gen1.NN; i++)
			System.out.print(gen1.next() + " ");
		Thread.yield();
	}
	
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i= 0; i<5; i++){
			exec.execute(new Cw04());
		}
	}

}
