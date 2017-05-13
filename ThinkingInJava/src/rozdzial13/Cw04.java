package rozdzial13;

import java.util.*;
public class Cw04 {
	int x,y,z;
	private double total = 0;
	private Formatter f = new Formatter(System.out);
	Cw04(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;		
	}
	public void printTitle() {
		String title = "%xs %ys %zs\n".replace("x", Integer.toString(x)).replace("y", Integer.toString(y)).replace("z", Integer.toString(z));
		f.format(title, "Item", "Qty", "Price");
		f.format(title, "----", "---", "-----");
	}
	public void print(String name, int qty, double price) {
		String content = "%x.20s %yd %z.2f\n".replace("x", Integer.toString(x)).replace("y", Integer.toString(y)).replace("z", Integer.toString(z));
		f.format(content, name, qty, price);
		total += price;
	}
	public void printTotal() {
		String tot1 = "%xs %ys %z.2f\n".replace("x", Integer.toString(x)).replace("y", Integer.toString(y)).replace("z", Integer.toString(z));
		String title2 = "%xs %ys %zs\n".replace("x", Integer.toString(x)).replace("y", Integer.toString(y)).replace("z", Integer.toString(z));
		f.format(tot1, "Tax", "", total*0.06);
		f.format(title2, "", "", "-----");
		f.format(tot1, "Total", "",	total * 1.06);
	}
	public static void main(String[] args) {
		Cw04 receipt = new Cw04(-20,5,10);
		receipt.printTitle();
		receipt.print("Jack’s Magic Beans", 4, 4.25);
		receipt.print("Princess Peas", 3, 5.1);
		receipt.print("Three Bears Porridge", 1, 14.29);
		receipt.printTotal();
	}
}