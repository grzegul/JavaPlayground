package uzytki;


import java.util.regex.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import static uzytki.SwingConsole.*;

class Liczenie extends JFrame{
	private JLabel l1 = new JLabel("Wklej tekst:");
	private JButton	b = new JButton("Iloœæ znakow:");
	
	private JTextArea t1 = new JTextArea(5, 40);
	private JTextField t2 = new JTextField(10);
	
	Cursor raczka = new Cursor(Cursor.HAND_CURSOR);
	
	public Liczenie(){
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x = obliczanie(t1.getText());
				String y = mielenie(t1.getText(), "\\s");
				t2.setText(y);
			}
		});
		setLayout(new FlowLayout());
		add(l1);
		add(new JScrollPane(t1));
		add(b);
		add(t2);
		b.setCursor(raczka);

	}
	private String obliczanie (String txt){
		return String.valueOf(txt.length());
	}
	private String mielenie(String expr, String reg){
		Pattern p = Pattern.compile(reg);
		return String.valueOf(p.matcher(expr.toString()).replaceAll("").length());
	}

}


public class LiczenieZnakow {
	public static void main(String[] args) {
		run(new Liczenie(), 600, 300);
	}
}