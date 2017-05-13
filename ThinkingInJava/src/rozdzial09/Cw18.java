package rozdzial09;

interface Cycle{
	int numberOfWheels();
}
interface CycleFactory{
	Cycle getCycle();
}

class Unicycle implements Cycle{
	public int numberOfWheels(){
		System.out.println("1 ko³o");
		return 1;
	}
}
class UnicycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Unicycle();
	}
}

class Bicycle implements Cycle{
	public int numberOfWheels(){
		System.out.println("2 ko³a");
		return 2;
	}
}
class BicycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Bicycle();
	}
}

class Tricycle implements Cycle{
	public int numberOfWheels(){
		System.out.println("3 ko³a");
		return 3;
	}
}
class TricycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return new Tricycle();
	}
}

public class Cw18 {
	public static void cycleUser(CycleFactory cf){
		Cycle c = cf.getCycle();
		c.numberOfWheels();
	}
	public static void main(String[] args) {
		cycleUser(new UnicycleFactory());
		cycleUser(new BicycleFactory());
		cycleUser(new TricycleFactory());
	}

}
