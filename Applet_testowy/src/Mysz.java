// Podaje wspó³rzêdne klikniêcia
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public
class Mysz extends Applet implements MouseListener
{
private int x,y;
String str;
public void init()
	{
	addMouseListener(this);
	}
public void paint (Graphics gDC)
	{
	gDC.drawString("Klikniêcie: "+ x + " / " + y, 10, 200);
	}
public void mouseClicked(MouseEvent evt)
	{
	x = evt.getX();
	y = evt.getY();
	repaint();
	}
public void mousePressed(MouseEvent evt) {}
public void mouseExited(MouseEvent evt) {}
public void mouseEntered(MouseEvent evt) {}
public void mouseReleased(MouseEvent evt) {}
}