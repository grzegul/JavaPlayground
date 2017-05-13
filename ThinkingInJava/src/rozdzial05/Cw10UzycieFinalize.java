package rozdzial05;
// hehe... ciekawe... kompletnie nie wiem, o co w tym cwiczeniu chodzi... :)
public class Cw10UzycieFinalize {
	boolean a = true;
	
	protected void finalize(){
		if (a){
			System.out.println("Zakonczono");
		}
	}
	
	public static void main(String[]args){
		Cw10UzycieFinalize uf = new Cw10UzycieFinalize();
		uf.finalize();
	}
}
