package rozdzial22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static rozdzial22.SwingConsole.*;

public class Cw05 extends JFrame {
	private JButton
	b1 = new JButton("Button 1"),
	b2 = new JButton("Button 2"),
	b3 = new JButton("Button 3");
	private JTextField txt = new JTextField(15);
	private ActionListener bl = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String name = ((JButton)e.getSource()).getText();
			txt.setText(name);
		}
	};
	public Cw05() {
		b1.addActionListener(bl);
		b2.addActionListener(bl);
		b3.addActionListener(bl);
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(b3);
		add(txt);
	}
	public static void main(String[] args) {
		run(new Cw05(), 300, 100);
	}
}