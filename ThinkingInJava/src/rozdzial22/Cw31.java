package rozdzial22;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.beans.*;
import java.util.*;

import static uzytki.SwingConsole.*;



public class Cw31 extends JFrame{
	private JProgressBar pb = new JProgressBar(0, 100);
	AsProg ap = new AsProg();
	ExecutorService exec = Executors.newSingleThreadExecutor();
	private int pause = 0;
	public int getPause() {
		return pause;
	}
	public void setPause(int pause) {
		this.pause = pause;
	}

	class AsProg extends JPanel implements Runnable {
		public void run(){
			try {				
				while (getPause()<100){
					TimeUnit.MILLISECONDS.sleep(getPause()^2);
					setPause(getPause()+1);
					pb.setValue(getPause());
					//System.out.println(getPause());
				}
			} catch(InterruptedException e) {
				// Acceptable way to exit
			}
		}	
	}
	
	public Cw31() {
		setLayout(new GridLayout(2,1));
		add(pb);
		pb.setValue(getPause());
		exec.execute(ap);
		//System.out.println("!!!" + pb.getValue());
		
	}
	public static void main(String[] args) {
		run(new Cw31(), 300, 200);
	}
}