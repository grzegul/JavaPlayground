package rozdzial14;

import java.util.*;
/*
interface Kanciaste{
	String obracalna();
};

abstract class Shape {
	void draw() {
		System.out.println(this + ".draw()");
	}
	void turn(){
		System.out.println(this + ".turn");
	}
	abstract public String toString();
}

class Circle extends Shape {
	public String toString() { return "Circle"; }
}
class Square extends Shape implements Kanciaste {
	public String obracalna(){
		return "Obracalna";
	}
	public String toString() { return "Square" + obracalna(); }
}
class Triangle extends Shape implements Kanciaste {
	public String obracalna(){
		return "Obracalna";
	}
	public String toString() { return "Triangle" + obracalna(); }
}*/

public class Cw06 {
	public static void main(String[] args) {
		List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());
		for(Shape shape : shapeList)
			shape.draw();
	}
}