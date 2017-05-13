package rozdzial22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static rozdzial22.SwingConsole.*;

public class Cw15CheckBoxes extends JFrame {
	private JButton
		b1 = new JButton("Button 1"),
		b2 = new JButton("Button 2"),
		b3 = new JButton("Button 3");
	private JTextField txt = new JTextField(15);
	private JCheckBox
		cb1 = new JCheckBox("Pierwszy"),
		cb2 = new JCheckBox("Drugi"),
		cb3 = new JCheckBox("Trzeci");
	
	
	private ActionListener bl = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String name = ((JButton)e.getSource()).getText();
			txt.setText(name);
		}
	};
	private ActionListener cl = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String name = ((JCheckBox)e.getSource()).getText();
			trace(name, (JCheckBox)e.getSource());
		}
	};
	
	public Cw15CheckBoxes() {
		b1.addActionListener(bl);
		b2.addActionListener(bl);
		b3.addActionListener(bl);
		cb1.addActionListener(cl);
		cb2.addActionListener(cl);
		cb3.addActionListener(cl);
		
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(b3);
		add(cb1);
		add(cb2);
		add(cb3);
		add(txt);
	}
	
	private void trace(String b, JCheckBox cb) {
		if(cb.isSelected())
		txt.setText("Box " + b + " Set\n");
		else
		txt.setText("Box " + b + " Cleared\n");
	}
	
	public static void main(String[] args) {
		run(new Cw15CheckBoxes(), 300, 200);
	}
}