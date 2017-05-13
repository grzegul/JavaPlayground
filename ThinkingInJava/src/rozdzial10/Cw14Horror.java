package rozdzial10;

interface Monster{
	void menace();
}
//interface DangerousMonster extends Monster{
//	void destroy();
//}

interface Lethal{
	void kill();
}
class DragonZilla{
	/*public void menace(){
		System.out.println("DragonZilla.menace");
	}*/
	public void destroy(){
		System.out.println("DragonZilla.destroy");
	}
	public Monster monster(){
		return new Monster(){
			public void menace(){
				System.out.println("Anon.Monster(DangerousMonster).menace");
			}
		};
	}
}
//interface Vampire extends DangerousMonster, Lethal{
//	void drinkBlood();
//}

class VeryBadVampire{
	/*public void menace(){
		System.out.println("VeryBadVampire.menace");
	}*/
	public void destroy(){
		System.out.println("VeryBadVampire.destroy");
	}
	
	public void drinkBlood(){
		System.out.println("VeryBadVampire.drinkBlood");
	}
	public Monster monster(){
		return new Monster(){
			public void menace(){
				System.out.println("Anon.Monster(DangerousMonster).menace");
			}
		};
	}
	public Lethal lethal(){
		return new Lethal(){
			public void kill(){
				System.out.println("Anon.Lethal.VeryBadVampire.kill");
			}
		};
	}
}

public class Cw14Horror {
	/*static void u(Monster b){
		b.menace();
	}
	static void v(DangerousMonster d){
		d.menace();
		d.destroy();
	}
	static void w(Lethal l){
		l.kill();
	}*/
	
	public static void main(String[] args) {
		DragonZilla dz = new DragonZilla();
		Monster barney = dz.monster();
		
		
		//DangerousMonster barney = new DragonZilla();
		barney.menace();
		barney.menace();
		dz.destroy();
		//u(barney);
		//v(barney);
		//Vampire vlad = new VeryBadVampire();
		VeryBadVampire vbv = new VeryBadVampire();
		Monster vlad = vbv.monster();
		Lethal let = vbv.lethal();
		vlad.menace();
		vlad.menace();
		vbv.destroy();
		let.kill();
		//u(vlad);
		//v(vlad);
		//w(vlad);
	}
}
/*
DragonZilla.menace
DragonZilla.menace
DragonZilla.destroy
VeryBadVampire.menace
VeryBadVampire.menace
VeryBadVampire.destroy
VeryBadVampire.kill
*/