package rozdzial21;

public class Cw01 implements Runnable {
	Cw01(){
		System.out.println("Przygotowanie..");
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
		Thread t1 = new Thread(new Cw01());
		t1.start();
		Thread t2 = new Thread(new Cw01());
		t2.start();
		Thread t3 = new Thread(new Cw01());
		t3.start();
		
	}

}
