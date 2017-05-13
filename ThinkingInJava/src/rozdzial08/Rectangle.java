package rozdzial08;

public class Rectangle extends Shape{
	@Override
	public void draw(){
		System.out.println("Rectangle.draw()");
	}
	@Override
	public void erase(){
		System.out.println("Rectangle.erase()");
	}
	@Override
	public void newClass(){
		System.out.println("Wiadomoœæ prostok¹tna przes³oniêta");
	}
}
