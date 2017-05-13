package rozdzial22;

import javax.swing.*;
import java.awt.*;
import static rozdzial22.SwingConsole.*;

public class Cw04 extends JFrame {
	private JButton
	b1 = new JButton("Button 1"),
	b2 = new JButton("Button 2");
	public Cw04() {
		//setLayout(new FlowLayout());
		add(b1);
		add(b2);
	}
	public static void main(String[] args) {
		run(new Cw04(), 200, 100);
	}
}