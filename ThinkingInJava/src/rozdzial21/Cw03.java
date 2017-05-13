package rozdzial21;

import java.util.concurrent.*;

public class Cw03 implements Runnable {
	Cw03(){
		System.out.println("Przygotowanie..." + id);
	}
	static int count = 0;
	final int id = count++;
	public String status(){
		return "id: " + id + "; ";
	}
	public void run(){
		System.out.println(status() + "GO 1!!! ");
		Thread.yield();
		System.out.println(status() + "GO 2!!! ");
		Thread.yield();
		System.out.println(status() + "GO 3!!! ");
		Thread.yield();
		System.out.println(status() + "GO 4!!! ");
		Thread.yield();
		System.out.println("Koniec " + id + "!");
	}
	public static void main(String[] args) {
		int NN = 6;
		ExecutorService exec = Executors.newFixedThreadPool(NN);
		for (int i=0; i<NN; i++){
			exec.execute(new Cw03());
		}
		
		
	}

}
