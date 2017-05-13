
public class Ghy {

	public static void main(String[] args) {	
		int x = 20;
		int y = 20;
		String ciag = "%xxs %yys %-30s\n";
		String ciag2 = ciag.replace("xx", Integer.toString(x)).replace("yy", Integer.toString(y));
		System.out.format(ciag2, "Item", "Qty", "Price");

	}

}
