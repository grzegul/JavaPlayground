package rozdzial08;

class AlertStatus{
	public void change(){
	}
}
class Working extends AlertStatus{
	public void change(){
		System.out.println("Sprawny");
	}
}
class Broken extends AlertStatus{
	public void change(){
		System.out.println("Zepsuty");
	}
}
class State{
	private AlertStatus s = new Working();
	public void stateChange(){
		s = new Broken();
	}
	public void checkState(){
		s.change();
	}
}

public class Cw16Starship {
	public static void main (String[] args){
		State state = new State();
		state.checkState();
		state.stateChange();
		state.checkState();
	}
}
