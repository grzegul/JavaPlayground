package rozdzial22;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.*;
import java.util.regex.*;

import static rozdzial22.SwingConsole.*;
public class Cw09ListMethods extends JFrame {
	private JTextField name = new JTextField(25);
	private JTextArea results = new JTextArea(40, 65);
	private static Pattern p = Pattern.compile("\\w+\\.");
	class NameL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String nm = name.getText().trim();
			if(nm.length() == 0) {
				results.setText("No match");
				return;
			}
			Class<?> kind;
			try {
				kind = Class.forName("rozdzial22." + nm);
			} catch(ClassNotFoundException ex) {
				results.setText("No match");
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
	public Cw09ListMethods() {
		NameL nameListener = new NameL();
		name.addActionListener(nameListener);
		JPanel top = new JPanel();
		top.add(new JLabel("Class name (press Enter):"));
		top.add(name);
		add(BorderLayout.NORTH, top);
		add(new JScrollPane(results));
		// Initial data and test:
		name.setText("Cw09ListMethods");
		nameListener.actionPerformed(
				new ActionEvent("", 0 ,""));
	}
	public static void main(String[] args) {
		run(new Cw09ListMethods(), 500, 400);
	}
}