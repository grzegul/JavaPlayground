import java.awt.*; //importujemy klasy
import java.util.*;
 
public class zegarek extends javax.swing.JApplet //klasa g��wna dziedziczy z JApplet
{ 
        private Color butterscotch = new Color(255, 204, 102); // ustawiamy sobie kolor
        private String lastTime = ""; //obiekt String o zmiennej lastTime o warto�ci ""
 
        public void init()  //inicjalizacja
        {
                setBackground(Color.black); //ustawienie koloru t�a na czarny
        }
 
        public void paint(Graphics screen) 
        {
                Graphics2D screen2D = (Graphics2D)screen;
                Font type = new Font("Monospaced", Font.BOLD, 20); //ustawiamy czcionk� dla zegarka
                screen2D.setFont(type); //czcionka (type) przypisywana do zegarka
                GregorianCalendar day = new GregorianCalendar(); //kalendarz gregoria�ski
                String time = day.getTime().toString(); // metoda gettime zwraca date i czas
                screen2D.setColor(Color.black);
                screen2D.drawString(lastTime, 5, 25);
 
                screen2D.setColor(butterscotch);
                screen2D.drawString(time, 5, 25);
                try
                {
                        Thread.sleep(1000); // metoda powoduje �e program "�pi" przez sekund� (1000milisekund)
                } catch (InterruptedException e) {}
        lastTime = time;
        repaint(); //przerysowanie
        }
}