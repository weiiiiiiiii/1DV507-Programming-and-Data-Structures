package ww222ag_assign1.exercise1;

import java.util.ArrayList;
//can not change this part
public class ShapeMain {
	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add( new Rectangle("R1",2,3) );  // base=2, height=3
		shapes.add( new Rectangle("R2",3,4) ); 
		shapes.add( new Square("S1",3) );       // side=3
		shapes.add( new Square("S2",5) );
		shapes.add( new Circle("C1",1) );       // radius=1
		shapes.add( new Circle("C2",2) );
		
		for (Shape s :shapes)  // Print all shapes
			System.out.println(s);
	}
}