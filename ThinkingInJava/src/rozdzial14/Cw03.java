package rozdzial14;

import java.util.Arrays;
import java.util.List;

class Rhomboid extends Shape{
	public String toString() { return "Rhomboid"; }
}

public class Cw03 {
	public static void main(String[] args) {
		List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());
		for(Shape shape : shapeList)
			shape.draw();
		Shape s = new Rhomboid();
		s.draw();
		((Rhomboid)s).draw();
		//((Circle)s).draw();		
	}
}
