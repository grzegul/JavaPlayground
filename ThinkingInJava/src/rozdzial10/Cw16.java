package rozdzial10;

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
	public static CycleFactory factory = new CycleFactory(){
		public Cycle getCycle(){
			return new Unicycle();
		}
	};
}

class Bicycle implements Cycle{
	public int numberOfWheels(){
		System.out.println("2 ko³a");
		return 2;
	}
	public static CycleFactory factory = new CycleFactory(){
		public Cycle getCycle(){
			return new Bicycle();
		}
	};
}

class Tricycle implements Cycle{
	public int numberOfWheels(){
		System.out.println("3 ko³a");
		return 3;
	}
	public static CycleFactory factory = new CycleFactory(){
		public Cycle getCycle(){
			return new Tricycle();
		}
	};
}

public class Cw16 {
	public static void cycleUser(CycleFactory cf){
		Cycle c = cf.getCycle();
		c.numberOfWheels();
	}
	public static void main(String[] args) {	
		cycleUser(Unicycle.factory);
		cycleUser(Bicycle.factory);
		cycleUser(Tricycle.factory);
	}

}
/*
1 ko³o
2 ko³a
3 ko³a
*/
