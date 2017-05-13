package rozdzial22;

import javax.swing.*;
import java.util.concurrent.*;
import static rozdzial22.SwingConsole.*;

public class Cw03 extends JFrame {
	JLabel label;
	public Cw03() {
		super("Hello Swing");
		label = new JLabel("A Label");
		add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) throws Exception {
		run(new Cw03(), 200, 100);
		TimeUnit.SECONDS.sleep(1);
		new Cw03().label.setText("Hey! This is Different!");
	}
}
