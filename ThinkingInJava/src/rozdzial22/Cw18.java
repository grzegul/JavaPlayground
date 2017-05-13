package rozdzial22;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import static uzytki.SwingConsole.*;
public class Cw18 extends JFrame {
	private JButton
			bA = new JButton("Alert"), bY = new JButton("Yes/No"),	bC = new JButton("Color"), bI = new JButton("Input"), bV = new JButton("3 Vals");
	private JTextField txt = new JTextField(15);
	private ActionListener aA = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "There’s a bug on you!", "Hey!", JOptionPane.ERROR_MESSAGE);
		}
	};
	private ActionListener aY = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showConfirmDialog(null, "or no", "choose yes", JOptionPane.YES_NO_OPTION);
		}
	};
	private ActionListener aC = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Object[] options = { "Red", "Green" };
			int sel = JOptionPane.showOptionDialog( null, "Choose a Color!", "Warning", JOptionPane.DEFAULT_OPTION,
													JOptionPane.WARNING_MESSAGE, null, options, options[0]);
			if(sel != JOptionPane.CLOSED_OPTION)
				txt.setText("Color Selected: " + options[sel]);
		}
	};
	private ActionListener aI = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String val = JOptionPane.showInputDialog( "How many fingers do you see?");
			txt.setText(val);
		}
	};
	private ActionListener aV = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Object[] selections = {"First", "Second", "Third"};
			Object val = JOptionPane.showInputDialog(
					null, "Choose one", "Input",
					JOptionPane.INFORMATION_MESSAGE,
					null, selections, selections[0]);
			if(val != null)
				txt.setText(val.toString());
		}
	};
	
	public Cw18() {
		setLayout(new FlowLayout());
		bA.addActionListener(aA);
		bY.addActionListener(aY);
		bC.addActionListener(aC);
		bI.addActionListener(aI);
		bV.addActionListener(aV);
		add(bA);
		add(bY);
		add(bC);
		add(bI);
		add(bV);
		add(txt);
	}
	public static void main(String[] args) {
		run(new Cw18(), 200, 200);
	}
}