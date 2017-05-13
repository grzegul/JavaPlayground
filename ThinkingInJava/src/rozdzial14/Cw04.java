package rozdzial14;

import java.util.Arrays;
import java.util.List;

class Rhomboid2 extends Shape{
	public String toString() { return "Rhomboid"; }
}

public class Cw04 {
	public static void main(String[] args) {
		List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());
		for(Shape shape : shapeList)
			shape.draw();
		Shape s = new Rhomboid2();
		s.draw();
		if(s instanceof Rhomboid2){
			((Rhomboid2)s).draw();
		}		
	}
}
