package rozdzial22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static uzytki.SwingConsole.*;
public class Cw30 extends JFrame {
	private JButton b = new JButton(
			"<html><b><font size=+2>" +
			"<center>Hello!<br><i>Press me now!");
	private ButtonGroup g = new ButtonGroup();
	private JRadioButton
	rb1 = new JRadioButton("one", false),
	rb2 = new JRadioButton("two", false),
	rb3 = new JRadioButton("three", false);
	private JTextField t = new JTextField(15);
	
	private ActionListener al = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//t.setText("Radio button " + ((JRadioButton)e.getSource()).getText());
			add(new JLabel("<html>" + "<i><font size=+2>Radio " + ((JRadioButton)e.getSource()).getText()));
			validate();
		}
	};
	
	public Cw30() {
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				add(new JLabel("<html>" + "<i><font size=+4>Kapow!"));
				// Force a re-layout to include the new label:
				validate();
			}
		});
		
		rb1.addActionListener(al);
		rb2.addActionListener(al);
		rb3.addActionListener(al);
		g.add(rb1); g.add(rb2); g.add(rb3);
		setLayout(new FlowLayout());
		add(rb1);
		add(rb2);
		add(rb3);
		//add(t);
		//t.setEditable(false);
		add(b);
	}
	public static void main(String[] args) {
		run(new Cw30(), 200, 500);
	}
}