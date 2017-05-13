package uzytki;

import javax.swing.*;

import javafx.*;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import static uzytki.SwingConsole.*;

public class KursorButton extends JFrame {
	private JButton
	b = new JButton("Button");
	private JTextField txt = new JTextField(15);
	Cursor raczka = new Cursor(Cursor.HAND_CURSOR);
	private static Random rand = new Random();
	private Color color = new Color(0);
	
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
			b.setBackground(new Color(rand.nextInt(0xFFFFFF))); //randomowy kolor po ka¿dym klikniêciu
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

	public KursorButton() {
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
		run(new KursorButton(), 300, 100);
	}
}