package rozdzial22;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.*;
import static uzytki.SwingConsole.*;
public class Cw32 extends JFrame {
	private JProgressBar pb = new JProgressBar();
	private ProgressMonitor pm = new ProgressMonitor(this, "Monitoring Progress", "Test", 0, 100);
	private JSlider sb = new JSlider(JSlider.HORIZONTAL, 0, 100, 60);
	public Cw32() {
		setLayout(new GridLayout(2,1));
		add(pb);
		sb.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				pm.setProgress(sb.getValue());
			}
		});
		pm.setProgress(0);
		pm.setMillisToPopup(1000);
		sb.setValue(0);
		sb.setPaintTicks(true);
		sb.setMajorTickSpacing(20);
		sb.setMinorTickSpacing(5);
		sb.setBorder(new TitledBorder("Slide Me"));
		//pb.setModel(sb.getModel()); // Share model
		add(sb);
		sb.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				pb.setValue(sb.getValue());
				pm.setProgress(sb.getValue());
			}
		});
	}
	public static void main(String[] args) {
		run(new Cw32(), 300, 200);
	}
}