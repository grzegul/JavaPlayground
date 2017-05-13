package rozdzial22;
//{Args: abcabcabcdefabc "abc+" "(abc)+" "	" }

import javax.swing.*;
import javafx.*;
import java.awt.*;
import java.awt.event.*;
import static rozdzial22.SwingConsole.*;

class Kursor extends JFrame{
	private JButton	jb = new JButton("JButton");
	private JTextField t = new JTextField(15);
	Cursor raczka = new Cursor(Cursor.HAND_CURSOR);
	
	
	public Kursor(){
		setLayout(new FlowLayout());
		//	zmienia kursor na r¹czkê, gdy siê najedzie na przycisk
		jb.setCursor(raczka);
		jb.setToolTipText(jb.getText());
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.setText(jb.getClass().getSimpleName());
			}
		});
		
		add(jb);
		add(t);
	}
	
}


public class Cw08ZmianaKursora {
	public static void main(String[] args) {
		run(new Kursor(), 200, 200);
		
	}
}