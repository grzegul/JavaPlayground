package rozdzial22;
//{Args: abcabcabcdefabc "abc+" "(abc)+" "	" }

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static rozdzial22.SwingConsole.*;
//import java.util.*;

class PrzechwytywanieZdarzen extends JFrame{
	private JButton	jb = new JButton("JButton");
	private Button b = new Button("Button");
	private JTextField t = new JTextField(15);
	private List lst = new List(4, false);
	private JFileChooser ch = new JFileChooser();

	
	public PrzechwytywanieZdarzen(){
		setLayout(new FlowLayout());
		
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.setText(jb.getClass().getSimpleName());
			}
		});
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.setText(b.getClass().getSimpleName());
			}
		});
		
		lst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.setText(lst.getClass().getSimpleName() + ": " + lst.getSelectedItem());
			}
		});
		lst.add("Mercury");
		lst.add("Venus");
		lst.add("Earth");
		lst.add("JavaSoft");
		lst.add("Mars");
		lst.add("Jupiter");
		lst.add("Saturn");
		lst.add("Uranus");
		lst.add("Neptune");
		lst.add("Pluto");
		
		ch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.setText(ch.getClass().getSimpleName());
			}
		});
		
		add(t);
		add(jb);
		add(b);
		add(lst);
		add(ch);
		
		
	}
}


public class Cw07 {
	public static void main(String[] args) {
		run(new PrzechwytywanieZdarzen(), 500, 500);
		
	}
}