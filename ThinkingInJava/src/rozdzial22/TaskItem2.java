package rozdzial22;

import java.util.concurrent.*;
public class TaskItem2<R,C extends Callable<R>> {
	public final Future<R> future;
	public final C task;
	public TaskItem2(Future<R> future, C task) {
		this.future = future;
		this.task = task;
	}
}