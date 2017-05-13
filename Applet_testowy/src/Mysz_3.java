// Na bie¿¹co podaje pozycjê kursora

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Mysz_3 extends Applet implements MouseMotionListener
{
private int x,y;
String str;
public void init()
	{
	addMouseMotionListener(this);
	}
public void paint (Graphics gDC)
	{
	gDC.drawString("Klikniêcie: "+ x + " / " + y, 10, 200);
	//Image img;
	//img = getImage(getDocumentBase(), "foto.jpg");
	//gDC.drawImage(img, 0, 0, this);
	}
public void mouseMoved(MouseEvent evt)
	{
	x = evt.getX();
	y = evt.getY();
	repaint();
	}
public void mouseDragged(MouseEvent evt) {}
}