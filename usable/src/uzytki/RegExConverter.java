package uzytki;


import java.util.regex.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import static uzytki.SwingConsole.*;

class TestRegEx extends JFrame{
	private JLabel l1 = new JLabel("Expression:");
	private JLabel l2 = new JLabel("RegEx:");
	private JButton	b = new JButton("Convert");
	private JTextArea t1 = new JTextArea(3, 50);
	private JTextField t2 = new JTextField(50);
	private JTextArea t3 = new JTextArea(5, 50);
	Cursor raczka = new Cursor(Cursor.HAND_CURSOR);
	
	public TestRegEx(){
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x = mielenie(t1.getText(), t2.getText());
				t3.setText(x);
			}
		});
		setLayout(new FlowLayout());
		add(l1);
		add(new JScrollPane(t1));
		add(l2);
		add(t2);
		add(b);
		b.setCursor(raczka);
		add(new JScrollPane(t3));
	}
	private String mielenie(String expr, String reg){
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(expr);
		//System.out.println(m.group());
		return p.matcher(expr.toString()).replaceAll("");
	}
}


public class RegExConverter {
	public static void main(String[] args) {
		run(new TestRegEx(), 600, 300);
	}
}