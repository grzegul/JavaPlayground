import java.applet.*;
import java.awt.*;



public class Test extends Applet
{
public void paint (Graphics gDC)
	{
	Font font = new Font ("SansSerif", Font.BOLD, 36);
	gDC.setFont(font);
	gDC.drawString("Pierwsza strza�ka :)", 10, 250);	// po�o�enie napisu (?)
	
	gDC.drawLine(120, 120, 160, 40);	// strza�ka
	gDC.drawLine(200, 120, 160, 40);
	gDC.drawLine(120, 120, 200, 120);
	gDC.drawLine(160, 200, 160, 120);
	
	gDC.drawOval(15, 50, 100, 100);	// ko�o (x, y, d�ugo��, wysoko��)
	gDC.fillOval(40, 75, 50, 50);	// wype�nienie (x, y, d�ugo��, wysoko��)
	
	gDC.setColor(Color.red);
	gDC.drawRect(210, 50, 150, 100);	// prostok�t (x, y, d�ugo��, wysoko��)
	
	Color color = Color.black;
	color = new Color(color.getRed()+40, color.getGreen()+140, color.getBlue()+10);
	gDC.setColor(color);
	gDC.fillRect(235, 75, 100, 50);
	
	// wy�wietlanie obrazu - co� nie dzia�a
	Image img;
	img = getImage(getDocumentBase(), "iskra.jpg");
	gDC.drawImage(img, 0, 0, this);
	
	}
}