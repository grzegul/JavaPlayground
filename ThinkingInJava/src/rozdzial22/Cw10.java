package rozdzial22;

import javax.swing.*;
import javafx.*;
import java.awt.*;
import java.awt.event.*;

import static rozdzial22.SwingConsole.*;

public class Cw10 extends JFrame {
	private JButton
	b = new JButton("Button");
	private JTextField txt = new JTextField(15);
	Cursor raczka = new Cursor(Cursor.HAND_CURSOR);
	
	// ten listener jeœli tylko klikniêcie
	/*private ActionListener bl = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String name = ((JButton)e.getSource()).getText();
			txt.setText(name);
		}
	};*/
	MouseListener ml = new MouseListener() {
		public void mouseClicked(MouseEvent e) {	//klikniêcie, ale zwróæ uwagê na metodê mouseExited
			String name = ((JButton)e.getSource()).getText();
			txt.setText(name);
		}
		public void mouseEntered(MouseEvent e) {
			txt.setText(b.getText());
		}
		public void mouseExited(MouseEvent e) {
			txt.setText("");
		}
		public void mousePressed(MouseEvent e) {
		}
		public void mouseReleased(MouseEvent e) {
		}
	};

	public Cw10() {
		//b.addActionListener(bl);
		b.setToolTipText(b.getText());	//wyœwietla komentarze
		b.addMouseListener(ml);
		setLayout(new FlowLayout());
		add(b);
		add(txt);
		txt.setEditable(false);
		b.setCursor(raczka);
	}
	public static void main(String[] args) {
		run(new Cw10(), 300, 100);
	}
}