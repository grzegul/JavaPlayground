package rozdzial09;

interface Processor{
	String name();
	Object process(Object input);
}

public class Apply {
	public static void process(Processor p, Object s){
		System.out.println("U¿ywam procesora " + p.name());
		System.out.println(p.process(s));
	}
}
