package rozdzial22;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import static uzytki.SwingConsole.*;
public class Cw16 extends JFrame {
	private String[] flavors = {
			"Chocolate", "Strawberry", "Vanilla Fudge Swirl",
			"Mint Chip", "Mocha Almond Fudge", "Rum Raisin",
			"Praline Cream", "Mud Pie"
	};
	private DefaultListModel lItems = new DefaultListModel();
	private JList lst = new JList(lItems);
	private JTextArea t = new JTextArea(flavors.length+1, 20);
	
	private ListSelectionListener ll =
			new ListSelectionListener() {
		public void valueChanged(ListSelectionEvent e) {
			if(e.getValueIsAdjusting()) return;
			t.setText("");
			for(Object item : lst.getSelectedValues())
				t.append(item + "\n");
		}
	};

	public Cw16() {
		for(int i=0; i<flavors.length; i++){
			lItems.add(0, flavors[i]);
		}
		t.setEditable(false);
		setLayout(new FlowLayout());
		// Create Borders for components:
		Border brd = BorderFactory.createMatteBorder(1, 1, 2, 2, Color.BLACK);
		lst.setBorder(brd);
		t.setBorder(brd);
		// Add the first four items to the List

		add(t);
		add(lst);
		// Register event listeners
		lst.addListSelectionListener(ll);
	}
	public static void main(String[] args) {
		run(new Cw16(), 250, 340);
	}
}