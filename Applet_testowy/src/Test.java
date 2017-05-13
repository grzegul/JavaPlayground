import java.applet.*;
import java.awt.*;



public class Test extends Applet
{
public void paint (Graphics gDC)
	{
	Font font = new Font ("SansSerif", Font.BOLD, 36);
	gDC.setFont(font);
	gDC.drawString("Pierwsza strza³ka :)", 10, 250);	// po³o¿enie napisu (?)
	
	gDC.drawLine(120, 120, 160, 40);	// strza³ka
	gDC.drawLine(200, 120, 160, 40);
	gDC.drawLine(120, 120, 200, 120);
	gDC.drawLine(160, 200, 160, 120);
	
	gDC.drawOval(15, 50, 100, 100);	// ko³o (x, y, d³ugoœæ, wysokoœæ)
	gDC.fillOval(40, 75, 50, 50);	// wype³nienie (x, y, d³ugoœæ, wysokoœæ)
	
	gDC.setColor(Color.red);
	gDC.drawRect(210, 50, 150, 100);	// prostok¹t (x, y, d³ugoœæ, wysokoœæ)
	
	Color color = Color.black;
	color = new Color(color.getRed()+40, color.getGreen()+140, color.getBlue()+10);
	gDC.setColor(color);
	gDC.fillRect(235, 75, 100, 50);
	
	// wyœwietlanie obrazu - coœ nie dzia³a
	Image img;
	img = getImage(getDocumentBase(), "iskra.jpg");
	gDC.drawImage(img, 0, 0, this);
	
	}
}