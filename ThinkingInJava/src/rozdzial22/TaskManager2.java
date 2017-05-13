package rozdzial22;

import java.util.concurrent.*;
import java.util.*;
public class TaskManager2<R,C extends Callable<R>> extends ArrayList<TaskItem2<R,C>> {
	public void add(C task) {
		ExecutorService exec = Executors.newSingleThreadExecutor();
		add(new TaskItem2<R,C>(exec.submit(task),task));
	}
	public List<R> getResults() {
		Iterator<TaskItem2<R,C>> items = iterator();
		List<R> results = new ArrayList<R>();
		while(items.hasNext()) {
			TaskItem2<R,C> item = items.next();
			if(item.future.isDone()) {
				try {
					results.add(item.future.get());
				} catch(Exception e) {
					throw new RuntimeException(e);
				}
				items.remove();
			}
		}
		return results;
	}
	public List<String> purge() {
		Iterator<TaskItem2<R,C>> items = iterator();
		List<String> results = new ArrayList<String>();
		while(items.hasNext()) {
			TaskItem2<R,C> item = items.next();
			// Leave completed tasks for results reporting:
			if(!item.future.isDone()) {
				results.add("Cancelling " + item.task);
				item.future.cancel(true); // May interrupt
				items.remove();
			}
		}
		return results;
	}
}