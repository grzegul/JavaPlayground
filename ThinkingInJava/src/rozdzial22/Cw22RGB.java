package rozdzial22;

import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static uzytki.SwingConsole.*;

class ColDraw extends JPanel {
	private int re;
	private int gr;
	private int bl;
	
	public int getRe() {
		return re;
	}
	public void setRe(int re) {
		this.re = re;
		repaint();
	}
	public int getGr() {
		return gr;
	}
	public void setGr(int gr) {
		this.gr = gr;
		repaint();
	}
	public int getBl() {
		return bl;
	}
	public void setBl(int bl) {
		this.bl = bl;
		repaint();
	}

	public ColDraw() {
		setRe(140);
		setGr(12);
		setBl(205);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(10, 10, 370, 100);
		Color col = new Color(re, gr, bl);
		g.setColor(col);
		g.fillRect(10, 10, 370, 100);
	}
}
public class Cw22RGB extends JFrame {
	private ColDraw colorValue = new ColDraw();
	private JSlider adjustRed = new JSlider(0, 255, 100);
	private JSlider adjustGreen = new JSlider(0, 255, 100);
	private JSlider adjustBlue = new JSlider(0, 255, 100);
	private JTextField
		tR = new JTextField(30),
		tG = new JTextField(30),
		tB = new JTextField(30);
	public Cw22RGB() {
		adjustRed.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				colorValue.setRe(((JSlider)e.getSource()).getValue());
				tR.setText(String.valueOf(((JSlider)e.getSource()).getValue()));
				tR.setEditable(false);
			}
		});
		adjustGreen.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				colorValue.setGr(((JSlider)e.getSource()).getValue());
				tG.setText(String.valueOf(((JSlider)e.getSource()).getValue()));
				tG.setEditable(false);
			}
		});
		adjustBlue.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				colorValue.setBl(((JSlider)e.getSource()).getValue());
				tB.setText(String.valueOf(((JSlider)e.getSource()).getValue()));
				tB.setEditable(false);
			}
		});
		
		
		//setLayout(new FlowLayout());
		setLayout(new GridLayout(8,1));
		add(adjustRed);
		add(tR);
		tR.setEditable(false);
		add(adjustGreen);
		add(tG);
		tG.setEditable(false);
		add(adjustBlue);
		add(tB);
		tB.setEditable(false);
		add(colorValue);
		
		
	}
	public static void main(String[] args) {
		run(new Cw22RGB(), 400, 400);
	}
}