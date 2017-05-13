package rozdzial11;
import java.util.*;

interface Selector {
	boolean end();
	Object current();
	void next();
}

public class Cw03Sequence {
	private ArrayList<Object> items;
	private int next = 0;
	public Cw03Sequence() {
		items = new ArrayList<Object>();
	}
	public void add(Object x) {
		items.add(x);
	}
	private class SequenceSelector implements Selector {
		private int i = 0;
		public boolean end() {
			return i == items.size();
		}
		public Object current(){
			return items.get(i);
		}
		public void next() {
			if(i < items.size()) i++;
		}
	}
	public Selector selector() {
		return new SequenceSelector();
	}
	public static void main(String[] args) {
		Cw03Sequence sequence = new Cw03Sequence();
		for(int i = 0; i < 15; i++)
			sequence.add(Integer.toString(i));
		Selector selector = sequence.selector();
		while(!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}
}
