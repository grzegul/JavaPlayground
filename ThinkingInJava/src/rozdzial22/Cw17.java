package rozdzial22;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import static uzytki.SwingConsole.*;
public class Cw17 extends JFrame {
	private JLabel l = new JLabel("Password:");
	private JPasswordField j = new JPasswordField(15);
	private JButton ok = new JButton("OK");
	private JButton ca = new JButton("Cancel");
	private char[] oo = {'x','l','s'};
	
	private ActionListener aok = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			char[] xx = j.getPassword();
			int count = 0;
			for(int i=0; i<xx.length; i++){
				if(xx[i] != oo[i]){
					JOptionPane.showMessageDialog(null, "Wrong password!!", "Error", JOptionPane.ERROR_MESSAGE);
					break;
				}else{
					count ++;
				}
			}
			if(count == oo.length){
				JOptionPane.showMessageDialog(null, "Wilkommen!!", "Info", JOptionPane.PLAIN_MESSAGE);
				System.exit(0);
			}
		}
	};
	private ActionListener aca = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	};
	
	public Cw17() {
		setLayout(new FlowLayout());
		ca.addActionListener(aca);
		ok.addActionListener(aok);
		add(l);
		add(j);
		add(ok);
		add(ca);
	}
	public static void main(String[] args) {
		run(new Cw17(), 200, 200);
	}
}