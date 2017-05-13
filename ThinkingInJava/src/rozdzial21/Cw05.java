package rozdzial21;

import java.util.*;
import java.util.concurrent.*;

class Fib implements Callable<String>{
	public String call(){
		Fibonacci gen1 = new Fibonacci(20);
		String wynik = "";
		for(int i = 0; i < gen1.NN; i++){
			wynik += gen1.next() + " ";
		}
		return wynik;
	}
}

public class Cw05{
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		ArrayList<Future<String>> results =	new ArrayList<Future<String>>();
		for(int i = 0; i < 10; i++)
			results.add(exec.submit(new Fib()));
		for(Future<String> fs : results)
			try {
				// get() blocks until completion:
				System.out.println(fs.get());
			} catch(InterruptedException e) {
				System.out.println(e);
				return;
			} catch(ExecutionException e) {
				System.out.println(e);
			} finally {
				exec.shutdown();
			}

	}

}
