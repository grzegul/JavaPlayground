package rozdzial08;

public class Square extends Shape{
	@Override
	public void draw(){
		System.out.println("Square.draw()");
	}
	@Override
	public void erase(){
		System.out.println("Square.erase()");
	}
	@Override
	public void newClass(){
		System.out.println("Wiadomość przesłonięta");
	}
}
