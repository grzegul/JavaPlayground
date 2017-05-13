package rozdzial10;

import java.util.*;

interface U{
	String pierwsza();
	String druga();
	String trzecia();
}

class A{
	public U u(){
		return new U(){
			public String pierwsza(){
				return "pierwsza";
			}
			public String druga(){
				return "druga";
			}
			public String trzecia(){
				return "trzecia";
			}
		};
	}
}
class B{
	private ArrayList<A>uList = new ArrayList<A>();
	public ArrayList<A> store(A a){
		uList.add(a);
		return uList;
	}
	public void setNull(A a){
		//int w = uList.indexOf(a);
		//uList.set(w,  null);
		uList.remove(a);
	}
	public void run(){
		for (int i=0; i<uList.size(); i++){
			System.out.println(uList.get(i).u().pierwsza());
			System.out.println(uList.get(i).u().druga());
			System.out.println(uList.get(i).u().trzecia());
		}
	}
}

public class Cw23 {
	public static void main (String[]args){
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		B b = new B();
		
		b.store(a1);
		b.store(a2);
		b.store(a3);
		
		b.setNull(a1);
		
		b.run();
	}
}
