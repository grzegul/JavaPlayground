package rozdzial21;

import java.util.concurrent.*;
import java.util.Random;

public class Cw06 implements Runnable{
	private static int taskCount = 0;
	private final int id = taskCount++;
	Random rand = new Random();
	int sec = rand.nextInt(10);
	public void run() {
		try {
			TimeUnit.SECONDS.sleep(sec);
			System.out.println("#" + id+ ": " + sec + "[s]");
		} catch(InterruptedException e) {
			System.err.println("Interrupted");
		}
	}
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0; i < 6; i++)
			exec.execute(new Cw06());
		exec.shutdown();
	}
}