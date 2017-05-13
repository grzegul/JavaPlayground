// Podaj wspó³rzêdne klikniêcia, czarny kwadrat (?)
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public
class Mysz_2 extends Applet implements MouseListener
{
private int x,y, z;
String str;
Rectangle rect;
public void init()
	{
	addMouseListener(this);
	rect = new Rectangle(75, 75, 50, 50);
	}
public void paint (Graphics gDC)
	{
	gDC.fillRect((int)rect.getX(), (int)rect.getY(), (int)rect.getWidth(), (int)rect.getHeight());
	gDC.drawString("Klikniêcie: "+ x + " / " + y, 10, 200);
	gDC.drawString("W kwadracie: "+ z, 10, 220);
	}
public void mouseClicked(MouseEvent evt)
	{
	x = evt.getX();
	y = evt.getY();
	if (rect.contains(x, y))
		{
		z = 1;
		}
	else
		{
		z = 0;
		}
	repaint();
	}
public void mousePressed(MouseEvent evt) {}
public void mouseExited(MouseEvent evt) {}
public void mouseEntered(MouseEvent evt) {}
public void mouseReleased(MouseEvent evt) {}
}