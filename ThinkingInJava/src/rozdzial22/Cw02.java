package rozdzial22;

import java.util.*;
import javax.swing.*;
import java.util.concurrent.*;
public class Cw02 {
	public static void main(String[] args) throws Exception {
		Random rand = new Random();
		int a = rand.nextInt(5);
		System.out.println(a);
		JFrame frame = new JFrame("Hello Swing");
		JLabel label = new JLabel("A Label");
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setVisible(true);
		TimeUnit.SECONDS.sleep(1);
		label.setText("Hey! This is Different!");
		for (int i=0; i<a; i++){
			TimeUnit.SECONDS.sleep(1);
			label.setText(String.valueOf(i));
		}
	}
}