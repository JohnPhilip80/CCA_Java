package edu.cca.john.java8;

import edu.cca.john.java8.lambda.Addable;
import edu.cca.john.java8.lambda.AddableImpl;
import edu.cca.john.java8.lambda.Circle;
import edu.cca.john.java8.lambda.Rectangle;
import edu.cca.john.java8.lambda.Shape;
import edu.cca.john.java8.lambda.Square;

public class Demo {

	public static void main(String[] args) {
		
		/*Shape shape;

		shape= new Rectangle();
		shape.draw();
		
		shape = new Circle();
		shape.draw();
		
		shape = new Square();
		shape.draw();
		*/
		
		/*Shape shape;
	
		shape = () -> System.out.println("Rectangle class : draw() method");
		shape.draw();
		shape = () -> System.out.println("Circle class : draw() method");
		shape.draw();
		shape = () -> System.out.println("Square class : draw() method");
		shape.draw();
		shape = () -> System.out.println("Oval class : draw() method");
		shape.draw();
		*/
		
		/*Shape rectangle = () -> System.out.println("Rectangle class : draw() method");
		rectangle.draw();
		Shape circle = () -> System.out.println("Circle class : draw() method");
		circle.draw();
		Shape square = () -> System.out.println("Square class : draw() method");
		square.draw();
		*/
		
		
		/*Shape rectangle = () -> System.out.println("Rectangle class : draw() method");
		Shape circle = () -> System.out.println("Circle class : draw() method");
		Shape square = () -> System.out.println("Square class : draw() method");
		
		print(rectangle);
		print(circle);
		print(square);
		*/
		
		/*print(() ->	System.out.println("Rectangle class : draw() method"));
		print(() ->	System.out.println("Circle class : draw() method"));
		print(() ->	System.out.println("Square class : draw() method"));
		*/
		
		/*Addable addition = new AddableImpl();
		System.out.println(addition.add2Numbers(7, 9));
		*/
		
		/*Addable addition = (a,b) ->	a+b;
		System.out.println(addition.add2Numbers(7, 9));
		*/
		
		Addable addition = (a,b) ->	{
			int c;
			c=a+b;
			return c;
		};
		System.out.println(addition.add2Numbers(7, 9));
	}
	
	public static void print(Shape shape) {
		shape.draw();
	}

}
