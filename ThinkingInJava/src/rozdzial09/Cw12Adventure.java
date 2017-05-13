package rozdzial09;

interface CanFight{
	void fight();
}
interface CanSwim{
	void swim();
}
interface CanFly{
	void fly();
}
interface CanClimb{
	void climb();
}

class ActionCharacter{
	public void fight(){
		System.out.println("ActionCharacter karate");
	}
	public void climb(){
		System.out.println("ActionCharacter hardcore bouldering");
	}
	public void swim(){
		System.out.println("ActionCharacter swim");
	}
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb{
	public void swim(){
		System.out.println("Hero swim");
	}
	public void fly(){
		System.out.println("Hero fly");
	}
}

public class Cw12Adventure {
	public static void t(CanFight x){
		x.fight();
	}
	public static void u(CanSwim x){
		x.swim();
	}
	public static void v(CanFly x){
		x.fly();
	}
	public static void w(ActionCharacter x){
		x.fight();
	}
	public static void y(CanClimb x){
		x.climb();
	}
	public static void z(ActionCharacter x){
		x.climb();
	}
	
	public static void main(String[] args) {
		Hero h = new Hero();
		t(h);
		u(h);
		v(h);
		w(h);
		y(h);
		z(h);
	}

}
