package rozdzial22;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.*;
import java.util.*;
import static uzytki.SwingConsole.*;
class CSq extends JPanel implements Runnable {
	private int pause;
	private int angle;
	private static Random rand = new Random();
	private Color color = new Color(0);
	private Graphics g;
	public Graphics getG() {
		return g;
	}
	public void setG(Graphics g) {
		this.g = g;
	}
	public void paintComponent(Graphics g) {
		//super.paintComponent(g);
		g.setColor(color);
		Graphics2D g2d = (Graphics2D)g;
		g2d.rotate(Math.toRadians(angle));
		//Dimension s = getSize();
		g.fillRect(50, 50, 50, 50);
		//setG(g);
	}
	public CSq(int pause) { this.pause = pause; }
	
	public void run() {
		try {
			while(!Thread.interrupted()) {
				color = new Color(rand.nextInt(0xFFFFFF));
				angle += 5;
				/*Graphics2D g2d = (Graphics2D)getG();
				g2d.rotate(Math.toRadians(5));
				setG((Graphics)g2d);*/
				repaint(); // Asynchronously request a paint()
				TimeUnit.MILLISECONDS.sleep(pause);
			}
		} catch(InterruptedException e) {
			// Acceptable way to exit
		}
	}
}
public class Rotate extends JFrame {
	private int grid = 1;
	private int pause = 500;
	private static ExecutorService exec = Executors.newCachedThreadPool();
	public void setUp() {
		setLayout(new GridLayout(grid, grid));
		CSq cb = new CSq(pause);
		add(cb);
		exec.execute(cb);
	}
	public static void main(String[] args) {
		Rotate boxes = new Rotate();
		boxes.setUp();
		run(boxes, 500, 500);
	}
}