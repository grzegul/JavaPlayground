package rozdzial21;

import java.util.concurrent.*;
public class Cw09ThPoolExec extends ThreadPoolExecutor {
	private int priority;
	
	
	public Cw09ThPoolExec(int priority) {
		super(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), new Cw09ThFact(priority));
	}
}