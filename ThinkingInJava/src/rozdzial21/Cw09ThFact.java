package rozdzial21;

import java.util.concurrent.*;

public class Cw09ThFact implements ThreadFactory {
	private int priority;
	public Cw09ThFact(int priority){
		this.priority = priority;
	}
	
	public Thread newThread(Runnable r) {
		Thread t = new Thread(r);
		t.setPriority(priority);
		return t;
	}
}


