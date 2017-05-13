package rozdzial09;

public class Cw11 implements Processor{
	public String name(){
		return "Cw11";
	}
	public String process(Object input){
		return (String)input;
	}
	
	public Object zamiana(String s){
		String[] c = s.split("");
		String a = "";
		int dlTablicy=0;
		if (c.length%2!=0){
			dlTablicy = c.length-1;
		}else{
			dlTablicy = c.length;
		}	
		for(int i=0; i<dlTablicy;i+=2){
			a = a+c[i+1]+c[i];
		}
		if (c.length%2!=0){
			a += c[c.length-1];
		}
		return a;
	}
	
	public static void main(String[] args) {
		Cw11 d = new Cw11();
		System.out.println(d.zamiana("Kolorowanka"));
		Apply.process(d, "Kolorowanka");
	}

}
