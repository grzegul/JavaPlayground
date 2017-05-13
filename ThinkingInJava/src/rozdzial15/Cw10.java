package rozdzial15;

public class Cw10 {
	public <U, W> void f(String x, U y, W z) {
		System.out.println(x.getClass().getName());
		System.out.println(y.getClass().getName());
		System.out.println(z.getClass().getName());
	}
	public static void main(String[] args) {
		Cw10 gm = new Cw10();
		gm.f("sfs",  45,  4.6);
	}
}