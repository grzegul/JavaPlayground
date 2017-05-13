package rozdzial05;

//Proste zastosowanie s³owa this

public class Cw07ThisLeaf {
	int i=0;
	
	Cw07ThisLeaf increment(){	//konstruktor?
		i++;
		return this;
	}
	
	void print(){
		System.out.println("i = "+i);
	}
	
	public static void main(String[]args){
		Cw07ThisLeaf x = new Cw07ThisLeaf();
		x.increment().increment().increment().print();
	}
}
