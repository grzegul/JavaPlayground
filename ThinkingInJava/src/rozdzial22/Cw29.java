package rozdzial22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static uzytki.SwingConsole.*;
public class Cw29 extends JFrame {
	private JTextField
	fileName = new JTextField(),
	dir = new JTextField();
	private JButton
	col = new JButton("Choose Color");

	public Cw29() {
		JPanel p = new JPanel();
		col.addActionListener(new ChooseCol());
		p.add(col);
		add(p, BorderLayout.SOUTH);
		dir.setEditable(false);
		fileName.setEditable(false);
		p = new JPanel();
		p.setLayout(new GridLayout(2,1));
		p.add(fileName);
		p.add(dir);
		add(p, BorderLayout.NORTH);
	}
	class ChooseCol extends JColorChooser implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JColorChooser c = new JColorChooser();
			Color cc = showDialog(Cw29.this, "Wybierz kolor", Color.RED);
			/*if(rVal == JFileChooser.APPROVE_OPTION) {
				fileName.setText(c.getSelectedFile().getName());
				dir.setText(c.getCurrentDirectory().toString());
			}
			if(rVal == JFileChooser.CANCEL_OPTION) {
				fileName.setText("You pressed cancel");
				dir.setText("");
			}*/
		}
	}
	
	public static void main(String[] args) {
		run(new Cw29(), 250, 150);
	}
}