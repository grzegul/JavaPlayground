package rozdzial22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.*;

import static uzytki.SwingConsole.*;
class CallableTask2 extends Task
implements Callable<String> {
	public String call() {
		run();
		return "Return value of " + this;
	}
}
public class Cw33 extends JFrame {
	private JButton
	b1 = new JButton("Start Long Running Task"),
	b2 = new JButton("End Long Running Task"),
	b3 = new JButton("Get results");
	private TaskManager2<String,CallableTask2> manager = new TaskManager2<String,CallableTask2>();
	public Cw33() {
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CallableTask2 task = new CallableTask2();
				manager.add(task);
				//System.out.println(task + " added to the queue");
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(String result : manager.purge())
					System.out.println(result);
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Sample call to a Task method:
				for(TaskItem2<String,CallableTask2> tt :
					manager)
					tt.task.id(); // No cast required
				for(String result : manager.getResults())
					System.out.println(result);
			}
		});
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(b3);
	}
	public static void main(String[] args) {
		run(new Cw33(), 200, 150);
	}
}