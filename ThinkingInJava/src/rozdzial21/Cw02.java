package rozdzial21;


public class Cw02 implements Runnable{
	public void run(){
		Fibonacci gen1 = new Fibonacci(20);
		for(int i = 0; i < gen1.NN; i++)
			System.out.print(gen1.next() + " ");
		Thread.yield();
	}
	
	public static void main(String[] args) {
		new Thread(new Cw02()).start();
//		new Thread(new Cw02()).start();

	}

}
