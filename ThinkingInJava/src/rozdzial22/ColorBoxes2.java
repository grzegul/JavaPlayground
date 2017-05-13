package rozdzial22;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.*;
import java.util.*;
import static uzytki.SwingConsole.*;
class CBox2 extends JPanel implements Runnable {
	private int pause;
	private static Random rand = new Random();
	private Color color = new Color(0);
	public void paintComponent(Graphics g) {
		g.setColor(color);
		Dimension s = getSize();
		g.fillRect(0, 0, s.width, s.height);
	}
	public CBox2(int pause) { this.pause = pause; }
	public void run() {
		try {
			while(!Thread.interrupted()) {
				color = new Color(rand.nextInt(0xFFFFFF));
				repaint(); // Asynchronously request a paint()
				TimeUnit.MILLISECONDS.sleep(pause);
			}
		} catch(InterruptedException e) {
			// Acceptable way to exit
		}
	}
}
public class ColorBoxes2 extends JFrame {
	private int grid = 12;
	private int pause = 50;
	private static ExecutorService exec =
			Executors.newCachedThreadPool();
	public void setUp() {
		setLayout(new GridLayout(grid, grid));
		for(int i = 0; i < grid * grid; i++) {
			CBox2 cb = new CBox2(pause);
			add(cb);
			exec.execute(cb);
		}
	}
	public static void main(String[] args) {
		ColorBoxes2 boxes = new ColorBoxes2();
		if(args.length > 0)
			boxes.grid = new Integer(args[0]);
		if(args.length > 1)
			boxes.pause = new Integer(args[1]);
		boxes.setUp();
		run(boxes, 500, 400);
	}
}