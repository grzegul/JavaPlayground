package rozdzial21;

import java.util.concurrent.*;
import rozdzial21.Daemons;

public class Cw07 {
	public static void main(String[] args) throws Exception {
		Thread d = new Thread(new Daemon());
		d.setDaemon(true);
		d.start();
		System.out.println("d.isDaemon() = " + d.isDaemon() + ", ");
		// Allow the daemon threads to
		// finish their startup processes:
		TimeUnit.SECONDS.sleep(5);
	}
}