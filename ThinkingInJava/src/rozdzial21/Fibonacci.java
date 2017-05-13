package rozdzial21;

import uzytki.*;

public class Fibonacci implements Generator<Integer> {
	protected int NN = 0;
	Fibonacci (int NN){
		this.NN = NN;
	}
	private int count = 0;
	public Integer next() { return fib(count++); }
	private int fib(int n) {
		if(n < 2) return 1;
		return fib(n-2) + fib(n-1);
	}
	public static void main(String[] args) {
		Fibonacci gen = new Fibonacci(20);
		for(int i = 0; i < gen.NN; i++)
			System.out.print(gen.next() + " ");
	}

}
