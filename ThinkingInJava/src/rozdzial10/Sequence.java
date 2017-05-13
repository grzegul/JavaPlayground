package rozdzial10;

interface Selector{
	boolean end();
	Object current();
	void next();
}

public class Sequence {
	private Object[] items;
	private int next = 0;
	public Sequence(int size){
		items = new Object[size];
	}
	public void add(Object x){
		if(next<items.length){
			items[next++] = x;
		}
	}
	private class SequenceSelector implements Selector{
		private int i = 0;
		public boolean end(){
			return i == items.length;
		}
		public Object current(){
			return items[i];
		}
		public void next(){
			if(i<items.length){
				i++;
			}
		}
		public Sequence outer(){		//Cw04 referencja do obiektu klasy zewnêtrznej
			return Sequence.this;		//samo "this" odnosi³oby siê do obiektu klasy wewnêtrznej
		}
	}
	public Selector selector(){
		return new SequenceSelector();
	}
	
	private class ReverseSelector implements Selector{
		private int i = items.length-1;
		public boolean end(){
			return i == -1;
		}
		public Object current(){
			return items[i];
		}
		public void next(){
			if(i>-1){
				i--;
			}
		}
	}
	public Selector reverseSelector(){
		return new ReverseSelector();
	}
	
	public static void main(String[] args) {
		int aa = 10;
		Sequence sequence = new Sequence(aa);
		for(int i=0; i<aa; i++){
			sequence.add(Integer.toString(i));
		}
		Selector selector = sequence.selector();
		while(!selector.end()){
			System.out.print(selector.current() + " ");
			selector.next();
		}
		Selector reverseSelector = sequence.reverseSelector();
		while(!reverseSelector.end()){
			System.out.print(reverseSelector.current() + " ");
			reverseSelector.next();
		}
		
		
		
		Cw02 c = new Cw02("wedw");
		Cw02 d = new Cw02("xxx");
		Cw02 e = new Cw02("eeeeeee");
		System.out.format("%n");
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}
