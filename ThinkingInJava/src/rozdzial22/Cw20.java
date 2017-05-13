package rozdzial22;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static uzytki.SwingConsole.*;
import uzytki.TextFile;

public class Cw20 extends JFrame {
	private JTextField t = new JTextField(15);
	private ActionListener al = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			t.setText(((JMenuItem)e.getSource()).getText());
		}
	};
	private JMenu[] menus = {
			new JMenu("a"), new JMenu("b"),
			new JMenu("c")
	};
	
	
	public Cw20(TreeSet<String> words) {
		int a = words.size();
		JMenuItem[] items = new JMenuItem[a];
		int j = 0;
		while(j<a){
			items[j] = new JMenuItem(words.pollFirst());
			System.out.println(items[j]);
			System.out.println(j);
			j++;
		}
		for(int i = 0; i < items.length; i++) {
			items[i].addActionListener(al);
			menus[i % 3].add(items[i]);
		}
		JMenuBar mb = new JMenuBar();
		for(JMenu jm : menus)
			mb.add(jm);
		setJMenuBar(mb);
		setLayout(new FlowLayout());
		add(t);
	}
	public static void main(String[] args) {
		TreeSet<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		words.addAll(new TextFile("SetOperations.java", "\\W+"));
		
		run(new Cw20(words), 200, 150);
	}
}