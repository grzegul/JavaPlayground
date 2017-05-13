package rozdzial21;

import java.util.concurrent.*;
public class Cw09 implements Runnable {
	private int countDown = 5;
	private volatile double d; // No optimization
	
	public String toString() {
		return Thread.currentThread() + ": " + countDown;
	}
	public void run() {
		try{
			while(true) {
				// An expensive, interruptable operation:
				for(int i = 1; i < 100000; i++) {
					d += (Math.PI + Math.E) / (double)i;
					if(i % 1000 == 0)
						Thread.yield();
				}
				System.out.println(this);
				if(--countDown == 0) return;
			}
		} catch(Exception e){
			System.out.println("Przerwano!");
		}
			
	}
	public static void main(String[] args) {
		int p = Thread.MIN_PRIORITY;
		ExecutorService exec = Executors.newCachedThreadPool(new Cw09ThFact(p));
		for (int i=0; i<5; i++)
			exec.execute(new Cw09());
		exec.shutdown();
	}
}