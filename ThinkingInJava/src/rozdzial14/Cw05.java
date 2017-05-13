package rozdzial14;

import java.util.*;

public class Cw05 {
	public static void main(String[] args) {
		List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());
		for(Shape shape : shapeList){
			shape.draw();
			if(!(shape instanceof Circle)){
				shape.turn();
			}
			
		}
			
	}
}