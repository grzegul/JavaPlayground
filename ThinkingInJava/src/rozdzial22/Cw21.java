package rozdzial22;

//ciekawe, czy to w³aœnie o to chodzi³o...

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import static uzytki.SwingConsole.*;
class SineDrawX extends JPanel {
	private static final int SCALEFACTOR = 200;
	private int cycles;
	private int points;
	private double[] sines;
	private int[] pts;
	
	public int getCycles() {
		return cycles;
	}
	public void setCycles(int cycles) {
		this.cycles = cycles;
		setPoints(SCALEFACTOR * cycles * 2);
		setSines(new double[getPoints()]);
		for(int i = 0; i < getPoints(); i++) {
			double radians = (Math.PI / SCALEFACTOR) * i;
			getSines()[i] = Math.sin(radians);
		}
		repaint();
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public double[] getSines() {
		return sines;
	}
	public void setSines(double[] sines) {
		this.sines = sines;
	}
	public int[] getPts() {
		return pts;
	}
	public void setPts(int[] pts) {
		this.pts = pts;
	}
	
	public SineDrawX() {
		setCycles(5);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int maxWidth = getWidth();
		double hstep = (double)maxWidth / (double)points;
		int maxHeight = getHeight();
		setPts(new int[getPoints()]);
		for(int i = 0; i < getPoints(); i++)
			getPts()[i] = (int)(getSines()[i] * maxHeight/2 * .95 + maxHeight/2);
		g.setColor(Color.RED);
		for(int i = 1; i < getPoints(); i++) {
			int x1 = (int)((i - 1) * hstep);
			int x2 = (int)(i * hstep);
			int y1 = getPts()[i-1];
			int y2 = getPts()[i];
			g.drawLine(x1, y1, x2, y2);
		}
	}
}
public class Cw21 extends JFrame {
	private SineDrawX sines = new SineDrawX();
	private JSlider adjustCycles = new JSlider(1, 30, 5);
	public Cw21() {
		add(sines);
		adjustCycles.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				sines.setCycles(((JSlider)e.getSource()).getValue());
			}
		});
		add(BorderLayout.SOUTH, adjustCycles);
	}
	public static void main(String[] args) {
		run(new Cw21(), 700, 400);
	}
}