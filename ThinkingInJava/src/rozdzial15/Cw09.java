package rozdzial15;

public class Cw09 {
	public <T, U, W> void f(T x, U y, W z) {
		System.out.println(x.getClass().getName());
		System.out.println(y.getClass().getName());
		System.out.println(z.getClass().getName());
	}
	public static void main(String[] args) {
		Cw09 gm = new Cw09();
		gm.f("", "", "");
		gm.f(1, 1 ,1);
		gm.f(1.0, 1.0, 1.0);
		gm.f(1.0F, 1.0F, 1.0F);
		gm.f('c', 'c', 'c');
		gm.f(gm, gm, gm);
		gm.f("sfs",  45,  4.6);
	}
}