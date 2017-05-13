package rozdzial11;
import java.util.*;
public class Controller {
	// A class from java.util to hold Event objects:
	private List<Event> eventList = new LinkedList<Event>();
	public void addEvent(Event c) {
		eventList.add(c);
	}
	public void run() {
		ListIterator<Event> it = eventList.listIterator();
		while(it.hasNext())
			// Make a copy so you’re not modifying the list
			// while you’re selecting the elements in it:
			for(Event e : new LinkedList<Event>(eventList))
				if(e.ready()) {
					System.out.println(e);
					e.action();
					eventList.remove(e);
				}
	}
}