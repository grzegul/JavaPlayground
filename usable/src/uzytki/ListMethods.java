package uzytki;

// nie dzia³aj¹ jeszcze klasy z innych projektów!!!!!!!!!!!!!!!!!!!!!!!!!!!!
/* u¿yæ tego:
Class cl = Class.forName("java.util.regex.Pattern");
		Method[] mm = cl.getDeclaredMethods();
		for (int i=0;i<mm.length;++i) {
		    System.out.print("Klasa " + cl + " ma metode '" + mm[i].getName().toString() + "'");
		    System.out.println(" ktora zwraca wartosc typu " + mm[i].getReturnType().toString());
	    }
	    Field[] ff = cl.getFields();
		System.out.println("Pola klasy " + cl + ": ");
		for (int i=0;i<ff.length;++i) {
		    System.out.println("'" + ff[i].getName().toString() + "'");
		    // WYCI¥GANIE WARTOŒCI REPREZENTOWANEJ PRZEZ STA£¥ (Pattern.CASE_INSENSITIVE) - rozdzial22.Cw15
		    if((ff[i].getName()).equals(input)){
		    	flag = ff[i].getInt(cl);
		    }
	    }
 */

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.*;
import java.util.regex.*;

import static uzytki.SwingConsole.*;

public class ListMethods extends JFrame {
	private JTextField name = new JTextField(25);
	private JTextField packName = new JTextField(25);
	private JTextArea results = new JTextArea(40, 35);
	private static Pattern p = Pattern.compile("\\w+\\.");
	class NameL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String nm = name.getText().trim();
			String pnm = packName.getText().trim();
			if(nm.length() == 0 || pnm.length() == 0) {
				results.setText("No match");
				return;
			}
			Class<?> kind;
			try {
				kind = Class.forName(pnm + "." + nm);
			} catch(ClassNotFoundException ex) {
				results.setText("Class not found");
				return;
			}
			Method[] methods = kind.getMethods();
			Constructor[] ctors = kind.getConstructors();
			results.setText("");
			for(Method m : methods) {
				results.append(p.matcher(m.toString()).replaceAll("") + "\n");
			}
			for(Constructor c : ctors){
				results.append(p.matcher(c.toString()).replaceAll("") + "\n");
			}
		}
	}
	public ListMethods() {
		NameL nameListener = new NameL();
		name.addActionListener(nameListener);
		NameL packNameListener = new NameL();
		packName.addActionListener(packNameListener);
		//JPanel top = new JPanel();
		setLayout(new FlowLayout());
		add(new JLabel("package name (press Enter):"));
		add(packName);
		add(new JLabel("Class name (press Enter):"));
		add(name);
		//add(BorderLayout.NORTH, top);
		add(new JScrollPane(results));
		// Initial data and test:
		packName.setText(this.getClass().getPackage().getName());
		name.setText(this.getClass().getSimpleName());	// nazwa bie¿¹cej metody
		nameListener.actionPerformed(new ActionEvent("", 0 ,""));
		packNameListener.actionPerformed(new ActionEvent("", 0 ,""));
	}
	public static void main(String[] args) {
		run(new ListMethods(), 500, 800);
	}
}