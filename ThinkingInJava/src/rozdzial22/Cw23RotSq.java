package rozdzial22;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


import static uzytki.SwingConsole.*;

class SqDraw extends JPanel implements Runnable {
	private int rozmiar;
	private int speed;
	private int degrees;
	private Color color = new Color(0);
	private static Random rand = new Random();

	public int getRozmiar() {
		return rozmiar;
	}
	public void setRozmiar(int rozmiar) {
		this.rozmiar = rozmiar;
		repaint();
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
		//repaint();
	}
	public int getDegrees() {
		return degrees;
	}
	public void setDegrees(int degrees) {
		this.degrees = degrees;
	}

	public SqDraw() {
		setRozmiar(50);
		setSpeed(50);
		setDegrees(10);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);	
        g.setColor(color);

        Graphics2D g2d = (Graphics2D)g;
        g2d.rotate(Math.toRadians(getDegrees()));
        g.fillRect(0, 0, getRozmiar(), getRozmiar());
        repaint();
	}


	public void run() {
		try {
			while(true) {
				color = new Color(rand.nextInt(0xFFFFFF));
				setDegrees(getDegrees()+5);
				repaint(); // Asynchronously request a paint()
				TimeUnit.MILLISECONDS.sleep(100-getSpeed());
			}
			
		} catch(InterruptedException e) {
			System.out.println(this + " interrupted");
			return;
		}
	}
	
}
public class Cw23RotSq extends JFrame {
	private SqDraw square = new SqDraw();
	private JSlider adjustRozmiar = new JSlider(10, 100, 50);
	private JSlider adjustSpeed = new JSlider(10, 100, 50);
	
	ExecutorService exec = Executors.newSingleThreadExecutor();
	
	public Cw23RotSq() {
		exec.execute(square);
		
		adjustRozmiar.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				square.setRozmiar(((JSlider)e.getSource()).getValue());
			}
		});
		adjustSpeed.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				square.setSpeed(((JSlider)e.getSource()).getValue());
			}
		});
		
		setLayout(new GridLayout(2,2));
		add(adjustRozmiar);
		add(adjustSpeed);
		adjustRozmiar.setBorder(new TitledBorder("Adjust Size"));
		adjustSpeed.setBorder(new TitledBorder("Adjust Speed"));
		add(square);
		
		
		/*
		add(BorderLayout.PAGE_START, adjustRozmiar);
		adjustRozmiar.setBorder(new TitledBorder("Adjust Size"));
		add(BorderLayout.AFTER_LAST_LINE, adjustSpeed);
		adjustSpeed.setBorder(new TitledBorder("Adjust Speed"));
		add(square);*/
	}
	
	public static void main(String[] args) throws InterruptedException {
		run(new Cw23RotSq(), 500, 400);


	}
}