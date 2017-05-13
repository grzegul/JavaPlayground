package rozdzial22;
//{Args: abcabcabcdefabc "abc+" "(abc)+" "	" }

import java.util.regex.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static rozdzial22.SwingConsole.*;

class RegexConverter extends JFrame{
	private JLabel l1 = new JLabel("Expression:");
	private JLabel l2 = new JLabel("Regex:");
	private JButton	b = new JButton("Convert");
	private JTextArea t1 = new JTextArea(3, 50);
	private JTextField t2 = new JTextField(50);
	private JTextArea t3 = new JTextArea(5, 50);
	private String expression = "";
	private String regex = "";
	
	public RegexConverter(){
		
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
		add(new JScrollPane(t3));
	}
	private String mielenie(String expr, String reg){
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(expr);
		//System.out.println(m.group());
		return p.matcher(expr.toString()).replaceAll("");
	}
}


public class Cw06TestRegEx {
	public static void main(String[] args) {
		run(new RegexConverter(), 600, 300);
		
		/*if(args.length < 2) {
			System.out.println("Usage:\njava TestRegularExpression characterSequence regularExpression+");
			System.exit(0);
		}
		System.out.println("Input: \"" + args[0] + "\"");
		for(String arg : args) {
			System.out.println("Regular expression: \"" + arg + "\"");
			Pattern p = Pattern.compile(arg);
			Matcher m = p.matcher(args[0]);
			while(m.find()) {
				System.out.println("Match \"" + m.group() + "\" at positions " +
						m.start() + "-" + (m.end() - 1));
			}
		}*/
	}
}