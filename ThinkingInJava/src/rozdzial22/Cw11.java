package rozdzial22;

import javax.swing.*;

import javafx.*;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import static rozdzial22.SwingConsole.*;

public class Cw11 extends JFrame {
	private MyButton b = new MyButton(Color.YELLOW, "Button");
	private static Random rand = new Random();
	private Color color = new Color(0);
	
	class MyButton extends JButton{
		private ActionListener bl = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b.setBackground(new Color(rand.nextInt(0xFFFFFF)));
			}
		};
		public MyButton(Color color, String label){
			super(label);
			setBackground(color);
			addActionListener(bl);
		}
	}
	public Cw11() {
		setLayout(new FlowLayout());
		add(b);
	}
	public static void main(String[] args) {
		run(new Cw11(), 300, 100);
	}
}