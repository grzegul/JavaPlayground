package rozdzial22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import uzytki.*;
import static uzytki.SwingConsole.*;

public class Cw14 extends JFrame {
	private JButton b = new JButton("Add Text");
	private JTextArea tp = new JTextArea(10,10);
	private static Generator sg = new RandomGenerator.String(7);
	public Cw14() {
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 1; i < 10; i++){
					tp.setText(tp.getText() + sg.next() + "\n");
				}	
			}
		});
		add(new JScrollPane(tp));
		add(BorderLayout.SOUTH, b);
	}
	public static void main(String[] args) {
		run(new Cw14(), 475, 425);
	}
}